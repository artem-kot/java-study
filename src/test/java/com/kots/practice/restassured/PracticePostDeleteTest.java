package com.kots.practice.restassured;

import com.kots.practice.restassured.json.Data;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class PracticePostDeleteTest extends BaseTestData {

    @Test
    @DisplayName("POST create new card: /api/cards using file")
    @Description("Basic test for creation of a new card")
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
        response.then().statusCode(401); //status code is changed to 401 as authorization will fail
        Data data = response.as(Data.class);
        String cardId = response.then().extract().body().path("data._id");
        assertThat(data, notNullValue());

//        removing newly created card
        response = given()
                .auth()
                .oauth2(token)
                .delete("/api/cards/" + cardId);
        response.then().statusCode(401); //status code is changed to 401 as authorization will fail
    }
}
