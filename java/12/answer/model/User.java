package com.java.model;

public class User {

    private int id;

    private String text;

    private String image;


    public User(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public User(int id, String text, String image) {
        this.id = id;
        this.text = text;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }
}
