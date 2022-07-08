package com.kots.practice.restassured;

import org.junit.Before;

import static io.restassured.RestAssured.baseURI;

public abstract class BaseTestData {
    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjU0MmU3ZWQzYjg2YTAwM2Q2N2MyNjkiLCJpYXQiOjE2NTcyNTkxMTMsImV4cCI6MTY1Nzg2MzkxM30.yDqdCStBaIYfw1DdVi98NWvo21v5rxyJieDbG97GtKU";

    @Before
    public void setup() {
        baseURI = "https://qa-mesto.praktikum-services.ru";
    }
}
