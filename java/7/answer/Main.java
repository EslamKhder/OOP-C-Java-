package com.java;


import java.util.Scanner;

import com.java.model.Club;
import com.java.model.ClubFc;
import com.java.model.ClubRel;
import com.java.service.ClubFCService;
import com.java.service.ClubFCServiceImpl;
import com.java.service.ClubRelService;
import com.java.service.ClubRelServiceImpl;
import com.java.service.ClubService;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Club club = new Club();
        club.setId(scanner.nextInt());
        club.setName(scanner.next());
        club.setNumber(scanner.nextInt());

        ClubFc clubFc = new ClubFc();
        clubFc.setId(scanner.nextInt());
        clubFc.setName(scanner.next());
        clubFc.setNumber(scanner.nextInt());
        clubFc.setFcode(scanner.nextInt());

        ClubRel clubRel = new ClubRel();
        clubRel.setId(scanner.nextInt());
        clubRel.setName(scanner.next());
        clubRel.setNumber(scanner.nextInt());
        clubRel.setRcode(scanner.nextInt());

        ClubService clubService = new ClubFCServiceImpl();
        clubService.printClub(club);
        ClubFCService clubFCService = new ClubFCServiceImpl();
        clubFCService.printClubFC(clubFc);


        ClubService clubService1 = new ClubRelServiceImpl();
        clubService1.printClub(club);
        ClubRelService clubRelService = new ClubRelServiceImpl();
        clubRelService.printClubRel(clubRel);
    }
}
