package com.kots.practice.restassured;
import com.google.gson.GsonBuilder;
import com.kots.practice.restassured.json.Card;
import com.google.gson.Gson;

public class Practice {
    public static void main(String[] args) {
        // serialization
        Gson serGson = new GsonBuilder().setPrettyPrinting().create();
        Card card = new Card("Интересное место", "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
        String json = serGson.toJson(card);
        System.out.println(json);

        //deserialization
        Gson desGson = new Gson();
        String jsonString = json;
        Card jsonCard = desGson.fromJson(jsonString, Card.class);
        System.out.println(jsonCard.getName());
    }
}
