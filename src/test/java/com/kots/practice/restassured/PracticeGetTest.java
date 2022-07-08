package com.kots.practice.restassured;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import io.qameta.allure.junit4.DisplayName;

public class PracticeGetTest extends BaseTestData{

    @Test
    @DisplayName("GET user info: /api/users/me")
    @Description("Basic test for getting user's info")
    public void testGetUserInfo() {
        given()
                .auth()
                .oauth2(token)
                .get("/api/users/me")
                .then().statusCode(200)
                .assertThat().body("data.name", equalTo("James Baxtor"));
    }

    @Test
    @DisplayName("GET cards: /api/cards")
    public void testGetCards() {
        given()
                .auth().oauth2(token)
                .get("/api/cards")
                .then().statusCode(200);
    }

    @Test
    @DisplayName("GET user info: /api/users/me occupation test")
    public void testUserOccupation() {
        Response response = given().auth().oauth2(token).get("/api/users/me");
        response.then().assertThat().body("data.about", equalTo("Horse on a ball (or is it?)"));
    }

    @Test
    @DisplayName("Check user name and print response body")
    @Description("This is a more complicated test with console output")
    public void checkUserNameAndPrintResponseBody() {
        Response response = sendGetRequestUsersMe();
        compareUserNameToText(response, "James Baxtor");
        printResponseBodyToConsole(response);
    }

    @Step("Send GET request to /api/users/me")
    public Response sendGetRequestUsersMe() {
        Response response = given()
                .auth()
                .oauth2(token)
                .get("/api/users/me");
        return response;
    }

    @Step("Compare user name to ER")
    public void compareUserNameToText(Response response, String username) {
        response.then().assertThat().body("data.name",equalTo(username));
    }

    @Step("Print response body to console")
    public void printResponseBodyToConsole(Response response){
        System.out.println(response.body().asString());
    }

}
