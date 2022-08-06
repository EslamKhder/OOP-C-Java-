package com.java.model;

public class Player extends BaseEntity{


    private String name;
    private Shirt shirt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }
}
