package com.kots.practice.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.notNullValue;

import io.restassured.response.Response;
import org.junit.Test;
import org.junit.Before;

import java.io.File;

public class PracticePostDelete extends BaseTestData {

    static String cardId = "";
    static Response response = null;

    @Before
    public void setup() {
        baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void testNewCardCreation() {
        File json = new File("src/test/resources/newCard.json");
        response =
                given()
                .header("Content-type", "application/json")
                .auth().oauth2(token)
                .and()
                .body(json)
                .when()
                .post("/api/cards");
//                cardId = response.body("data._id").toString();
        response.then().assertThat().body("data._id", notNullValue())
                .and()
                .statusCode(201);
        System.out.println(response);
    }

    @Test
    public void testExistingCardRemoval() {

        Response response =
                given()
                .auth()
                .oauth2(token)
                .delete("/api/cards/" + cardId);
//                cardId = response.body("data._id").toString();
        System.out.println(cardId);
    }
}
