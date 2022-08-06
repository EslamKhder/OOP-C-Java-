package com.java;

import com.java.model.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"text 1");
        User user2 = new User(1,"text 1","image");



        System.out.println(user2.getImage());
    }
}