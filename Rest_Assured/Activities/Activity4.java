package activities;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity4 {

    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;

    @BeforeClass
    public void setup() {
        // Build RequestSpecification
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .build();

        // Build ResponseSpecification
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    // Test 1: Add a new pet
    @Test(priority = 1)
    public void addNewPet() {
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 77232);
        reqBody.put("name", "Riley");
        reqBody.put("status", "alive");

        Response response = given()
                .spec(requestSpec)
                .body(reqBody)
        .when()
                .post();

        // Validate response using ResponseSpecification
        response.then().spec(responseSpec);

        // Additional assertions
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    // Test 2: Get pet information
    @Test(priority = 2)
    public void getPetInfo() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("petId", 77232)
        .when()
                .get("/{petId}");

        // Validate response
        response.then().spec(responseSpec);

        // Additional assertions
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    // Test 3: Delete pet
    @Test(priority = 3)
    public void deletePet() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("petId", 77232)
        .when()
                .delete("/{petId}");

        // ResponseSpecification also works here
        response.then()
                .statusCode(200)  // delete returns code 200
                .contentType(ContentType.JSON)
                .body("code", equalTo(200))
                .body("message", equalTo("77232"));
    }
}
