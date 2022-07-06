package com.kots.practice.restassured;

import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.Before;

import java.io.File;

public class PracticePatch extends BaseTestData {

    @Test
    public void testPatchUser() {
        File json = new File("src/test/resources/userInfo.json");
        Response response =
                given()
                        .header("Content-type", "application/json")
                        .auth().oauth2(token)
                        .and()
                        .body(json)
                        .when()
                        .patch("/api/users/me");
        response.then().assertThat()
                .statusCode(200)
                .body("data.name", equalTo("James Baxtor"));
    }
}