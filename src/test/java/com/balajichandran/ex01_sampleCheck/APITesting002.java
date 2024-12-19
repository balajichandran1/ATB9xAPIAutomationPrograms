package com.balajichandran.ex01_sampleCheck;


import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {

        //Gherkins Syntax
        //Given() -> Pre Req. - URL, Headers,Auth, Body..
        //When() -> HTTP Method? - GET/POST/PUT/PATCH, DELETE..
        //Then() -> Validation -> 200 ok, firstname -- BALAJI

        // Full URI - https://api.zippopotam.us/IN/560003
        // base URI - https://api.zippopotam.us
        //base Path - /IN/560003
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560003")
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
}
