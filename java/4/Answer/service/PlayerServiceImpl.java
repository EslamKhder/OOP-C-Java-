package com.java.service;

import com.java.model.Player;
import com.java.validate.ValidationService;

public class PlayerServiceImpl implements PlayerService{

    @Override
    public void print(Player player){
        if (ValidationService.validatePlayer(player)){
            System.out.println(player.getId() + " " + player.getName() + " " + player.getNumber());
        } else {
            System.out.println("invalid data");
        }

    }
}
