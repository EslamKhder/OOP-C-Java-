package com.java;

import com.java.model.Player;
import com.java.model.Shirt;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setId(1);
        player.setName("messi");
        Shirt shirt = new Shirt();
        shirt.setId(1);
        shirt.setNumber(10);
        shirt.setColor("blue");

        player.setShirt(shirt);
        shirt.setPlayer(player);

        System.out.println(shirt.getPlayer().getName());
        System.out.println(player.getShirt().getNumber());
    }
}