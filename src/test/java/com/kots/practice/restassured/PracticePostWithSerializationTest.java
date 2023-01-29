package com.kots.practice.restassured;

import com.kots.practice.restassured.json.Card;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PracticePostWithSerializationTest extends BaseTestData {

    @Test
    @DisplayName("POST create new card: /api/cards using serialization")
    @Description("Basic test for creation of a new card")
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
        String cardId = response.then().extract().body().path("data._id");
        response.then().statusCode(401); //status code is changed to 401 as authorization will fail

//        removing newly created card
        response = given()
                .auth()
                .oauth2(token)
                .delete("/api/cards/" + cardId);
        response.then().statusCode(401); //status code is changed to 401 as authorization will fail
    }
}
