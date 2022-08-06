package com.java.service;

import com.java.model.Order;

public interface RestaurantService {

    Order saveOrder(Order order);

    void showOrder(Order order);
}
