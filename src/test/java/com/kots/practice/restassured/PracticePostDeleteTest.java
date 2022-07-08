package com.kots.practice.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kots.practice.restassured.json.Data;
import io.restassured.response.Response;
import org.ietf.jgss.GSSContext;
import org.junit.Test;
import org.junit.Before;
import java.io.File;

public class PracticePostDeleteTest extends BaseTestData {

    static String cardId = "";
    static Response response = null;

    @Before
    public void setup() {
        baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void testNewCardCreation() {
        File json = new File("src/test/resources/newCard.json");
//        creating new card
        Response response =
                given()
                .header("Content-type", "application/json")
                .auth().oauth2(token)
                .and()
                .body(json)
                .when()
                .post("/api/cards");
        response.then().statusCode(201);
        Data data = response.as(Data.class);
        cardId = response.then().extract().body().path("data._id");
        assertThat(data, notNullValue());

//        removing newly created card
        response = given()
                .auth()
                .oauth2(token)
                .delete("/api/cards/" + cardId);

        response.then().statusCode(200);
    }
}
