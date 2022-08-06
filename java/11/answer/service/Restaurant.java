package com.java.service;

import com.java.model.Order;

public class Restaurant extends RestaurantServiceImpl{
    @Override
    public void showOrder(Order order) {
        System.out.println(order.getId() + "   " + order.getRequest());
    }
}
