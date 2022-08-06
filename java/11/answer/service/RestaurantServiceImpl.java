package com.java.service;

import com.java.model.Order;

public abstract class RestaurantServiceImpl implements RestaurantService{
    @Override
    public Order saveOrder(Order order) {
        return order;
    }

    @Override
    public abstract void showOrder(Order order);
}
