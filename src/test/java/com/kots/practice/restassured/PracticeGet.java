package com.kots.practice.restassured;

import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeGet extends BaseTestData{

    @Test
    public void testGetUserInfo() {
        given()
                .auth()
                .oauth2(token)
                .get("/api/users/me")
                .then().statusCode(200)
                .assertThat().body("data.name", equalTo("Аристарх Сократович"));
    }

    @Test
    public void testGetCards() {
        given()
                .auth().oauth2(token)
                .get("/api/cards")
                .then().statusCode(200);
    }

    @Test
    public void testUserOccupation() {
        Response response = given().auth().oauth2(token).get("/api/users/me");
        response.then().assertThat().body("data.about", equalTo("Автор автотестов"));
    }
}
