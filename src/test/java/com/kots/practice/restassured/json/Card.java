package com.kots.practice.restassured.json;

public class Card {

    private String name;
    private String link;

    public Card(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Card() {
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
