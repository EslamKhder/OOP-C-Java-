package com.java.service;

import com.java.model.Club;
import com.java.model.ClubFc;

public class ClubFCServiceImpl implements ClubService,ClubFCService{
    @Override
    public void printClub(Club club) {
        System.out.println(club.getId() + " - " + club.getName() + " - " + club.getNumber());
    }

    @Override
    public void printClubFC(ClubFc clubFc) {
        System.out.println(clubFc.getId() + " - " + clubFc.getName() + " - " + clubFc.getNumber() + " - " + clubFc.getFcode());
    }
}
