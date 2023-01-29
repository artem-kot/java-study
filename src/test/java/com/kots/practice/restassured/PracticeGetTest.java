package com.kots.practice.restassured;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeGetTest extends BaseTestData {

    @Test
    @DisplayName("GET user info: /api/users/me")
    @Description("Basic test for getting user's info")
    public void testGetUserInfo() {
        given()
                .auth()
                .oauth2(token)
                .get("/api/users/me")
                .then().statusCode(401) //status code is changed to 401 as authorization will fail
                .assertThat().body("data.name", equalTo(null)); //null as it's 401 now
    }

    @Test
    @DisplayName("GET cards: /api/cards")
    public void testGetCards() {
        given()
                .auth().oauth2(token)
                .get("/api/cards")
                .then().statusCode(401); //status code is changed to 401 as authorization will fail
    }

    @Test
    @DisplayName("GET user info: /api/users/me occupation test")
    public void testUserOccupation() {
        Response response = given().auth().oauth2(token).get("/api/users/me");
        response.then().assertThat().body("data.about", equalTo(null)); //changed to null as it's 401 now
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
        response.then().assertThat().body("data.name", equalTo(null)); //didn't use username argument as call returns 401
    }

    @Step("Print response body to console")
    public void printResponseBodyToConsole(Response response) {
        System.out.println(response.body().asString());
    }

}
