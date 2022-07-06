package com.kots.practice.restassured;

import com.kots.practice.restassured.json.Card;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.junit.Test;

public class PracticePostWithSerialization extends BaseTestData{

    @Test
    public void testCardCreationWithSerialization() {
        Card card = new Card("Интересное место", "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
        Response response =
                given()
                        .headers("Content-type", "application/json")
                        .auth()
                        .oauth2(token)
                        .and()
                        .body(card)
                        .when()
                        .post("/api/cards");
        response.then().statusCode(201);
    }
}
