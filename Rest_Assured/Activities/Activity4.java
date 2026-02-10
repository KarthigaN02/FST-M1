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

public class Activity4 {

    RequestSpecification requestSpec;

    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .build();
    }

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
                .post(); // POST request to base URI

        // Assertions
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 2)
    public void getPetInfo() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("petId", 77232)
        .when()
                .get("/{petId}");

        // Assertions
        response.then().body("id", equalTo(77232));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority = 3)
    public void deletePet() {
        Response response = given()
                .spec(requestSpec)
                .pathParam("petId", 77232)
        .when()
                .delete("/{petId}");

        // Assertions
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77232"));
    }
}
