package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Bill extends BaseEntity{


    private List<Order> orders = new ArrayList<>();

    private Person person;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
