package com.kots.practice.restassured.json;

public class Data {
    private Profile profile;
    private Card card;

    public Data(Profile profile) {
        this.profile = profile;
    }

    public Data(Card card) {
        this.card = card;
    }

    public Data() {
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
