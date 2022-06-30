package com.kots.practice.restassured;

import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeGet {

    @Before
    public void setup() {
        baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void testGetUserInfo() {
        given()
                .auth()
                .oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjU0MmU3ZWQzYjg2YTAwM2Q2N2MyNjkiLCJpYXQiOjE2NTY0ODkyODgsImV4cCI6MTY1NzA5NDA4OH0.dOE0IGs3ULyA810CdSp6ug6SxuGDCYXoDMb8XHvuYD0")
                .get("/api/users/me")
                .then().statusCode(200)
                .assertThat().body("data.name", equalTo("Аристарх Сократович"));
    }

    @Test
    public void testGetCards() {
        given()
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjU0MmU3ZWQzYjg2YTAwM2Q2N2MyNjkiLCJpYXQiOjE2NTY0ODkyODgsImV4cCI6MTY1NzA5NDA4OH0.dOE0IGs3ULyA810CdSp6ug6SxuGDCYXoDMb8XHvuYD0")
                .get("/api/cards")
                .then().statusCode(200);
    }

    @Test
    public void testUserOccupation() {
        Response response = given().auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjU0MmU3ZWQzYjg2YTAwM2Q2N2MyNjkiLCJpYXQiOjE2NTY0ODkyODgsImV4cCI6MTY1NzA5NDA4OH0.dOE0IGs3ULyA810CdSp6ug6SxuGDCYXoDMb8XHvuYD0").get("/api/users/me");
        response.then().assertThat().body("data.about", equalTo("Автор автотестов"));
    }
}
