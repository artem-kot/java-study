package com.kots.practice.restassured;

import com.kots.practice.restassured.json.Profile;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.File;

public class PracticePatchTest extends BaseTestData {

    @Test
    @DisplayName("PATCH user info: /api/users/me from the file")
    @Description("Basic test for patching a user's name and occupation")
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

    @Test
    @DisplayName("PATCH user info: /api/users/me using serialization")
    @Description("Basic test for patching a user's name and occupation")
    public void testPatchUserWithSerialization() {
        Profile profile = new Profile("James Baxtor", "Horse on a ball (or is it?)");
        given()
                .auth().oauth2(token)
                .headers("Content-type", "application/json")
                .and()
                .body(profile)
                .when()
                .patch("/api/users/me")
                .then()
                .statusCode(200);
    }
}