package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Person extends BaseEntity{

    private List<Order> orders = new ArrayList<>();

    private List<Bill> bills = new ArrayList<>();

    private Gift gift;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }
}
