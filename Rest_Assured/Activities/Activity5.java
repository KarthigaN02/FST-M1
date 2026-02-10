package activities;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import au.com.dius.pact.consumer.junit5.Pact;


@ExtendWith(PactConsumerTestExt.class)
public class Activity5 {

    // Define the request/response body using Pact DSL
    private PactDslJsonBody reqResBody = new PactDslJsonBody()
            .numberType("id", 123)
            .stringType("firstName", "Taro")
            .stringType("lastName", "Sakamoto")
            .stringType("email", "sakamotodays@example.com");

    // Create the Pact contract
    @au.com.dius.pact.consumer.junit5.Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        return builder
                .given("POSTRequest")
                .uponReceiving("A request to add user data")
                    .method("POST")
                    .path("/api/path")
                    .body(reqResBody)
                .willRespondWith()
                    .status(200)
                    .body(reqResBody)
                .toPact();
    }

    // Consumer test with mock provider
    @Test
    @PactTestFor(providerName = "UserProvider", port = "9000")
    public void postRequestTest() {

        // Create a request body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 123);
        reqBody.put("firstName", "Taro");
        reqBody.put("lastName", "Sakamoto");
        reqBody.put("email", "sakamotodays@example.com");

        // Send POST request to mock server and assert response
        given()
            .baseUri("http://localhost:9000/api/path")
            .header("Content-Type", "application/json")
            .body(reqBody)
            .log().all()
        .when()
            .post()
        .then()
            .statusCode(200)
            .body("lastName", equalTo("Sakamoto"))
            .log().all();
    }
}
