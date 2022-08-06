package com.java;

import com.java.model.ClubPlayer;
import com.java.service.ClubITI;
import com.java.service.ClubMIT;
import com.java.service.PrivateClubService;
import com.java.service.PrivateClubServiceImpl;
import com.java.service.PublicClubService;
import com.java.service.PublicClubServiceImpl;

public class Main {
    public static void main(String[] args) {

        ClubPlayer player = new ClubPlayer();
        player.setId(1);
        player.setName("Player 1");
        player.setAge("20");

        PublicClubService publicClubService = new PublicClubServiceImpl();
        System.out.println(publicClubService.savePlayer(player).getName());

        player.setId(2);
        player.setName("Player 2");
        player.setAge("22");

        PrivateClubService privateClubService = new PrivateClubServiceImpl();
        System.out.println(privateClubService.savePlayer(player).getName());
    }

}