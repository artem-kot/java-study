package com.kots.practice.restassured;

import org.junit.Before;

import static io.restassured.RestAssured.baseURI;

public abstract class BaseTestData {
    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjU0MmU3ZWQzYjg2YTAwM2Q2N2MyNjkiLCJpYXQiOjE2NTY1MjI5NjgsImV4cCI6MTY1NzEyNzc2OH0.oTyAsyayTpJlXDMj2eSWbZrr8WYjfWAbvOzrtF6eRO8";

    @Before
    public void setup() {
        baseURI = "https://qa-mesto.praktikum-services.ru";
    }
}
