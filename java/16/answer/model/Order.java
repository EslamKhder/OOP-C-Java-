package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Order extends BaseEntity{


    private Person person;

    private List<Food> foods = new ArrayList<>();

    private Bill bill;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
