package com.ex_samplecheck;

import io.restassured.RestAssured;

public class APITesting_02 {
    public static void main(String[] args) {

        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/533002")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
