package com.kots.practice.restassured.json;

import java.util.ArrayList;

public class Card {

    private ArrayList likes;
    private String _id;
    private String name;
    private String link;
    private String owner;
    private String createdAt;

    public Card(ArrayList likes, String _id, String name, String link, String owner, String createdAt) {
        this.likes = likes;
        this._id = _id;
        this.name = name;
        this.link = link;
        this.owner = owner;
        this.createdAt = createdAt;
    }

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

    public ArrayList getLikes() {
        return likes;
    }

    public void setLikes(ArrayList likes) {
        this.likes = likes;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
