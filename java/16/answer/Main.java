package com.java;

import com.java.model.Bill;
import com.java.model.Food;
import com.java.model.Gift;
import com.java.model.Order;
import com.java.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Islam");

        Order order1 = new Order();
        order1.setId(1);
        order1.setName("Order 1");

        Order order2 = new Order();
        order2.setId(2);
        order2.setName("Order 2");

        Food food1 = new Food();
        food1.setId(1);
        food1.setName("Food 1");

        Food food2 = new Food();
        food2.setId(2);
        food2.setName("Food 2");

        Bill bill = new Bill();
        bill.setId(1);
        bill.setName("Bill 1");

        Gift gift = new Gift();
        gift.setId(1);
        gift.setCode("code");

        person.setGift(gift);
        person.getOrders().add(order1);
        person.getOrders().add(order2);
        person.getBills().add(bill);

        order1.setBill(bill);
        order1.setPerson(person);
        order1.getFoods().add(food1); // 0

        order2.setBill(bill);
        order2.setPerson(person);
        order2.getFoods().add(food2);

        food1.setOrder(order1);
        food2.setOrder(order2);

        bill.setPerson(person);
        bill.getOrders().add(order1);
        bill.getOrders().add(order2);

        gift.setPerson(person);

        System.out.println(bill.getOrders().get(1).getFoods().get(0).getName());
    }
}