package com.java.model;

public class Food extends BaseEntity{

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
