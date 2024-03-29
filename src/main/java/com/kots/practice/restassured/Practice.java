package com.kots.practice.restassured;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kots.practice.restassured.json.Card;

public class Practice {
    public static void main(String[] args) {
        // serialization - object -> json
        Gson serGson = new GsonBuilder().setPrettyPrinting().create();
        Card card = new Card("Интересное место", "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
        String json = serGson.toJson(card);
        System.out.println(json);

        //deserialization - json -> object
        Gson desGson = new Gson();
        String jsonString = json;
        Card jsonCard = desGson.fromJson(jsonString, Card.class);
        System.out.println(jsonCard.getName());
    }
}
