package com.java.service;

import com.java.model.Club;
import com.java.model.ClubRel;

public class ClubRelServiceImpl implements ClubService,ClubRelService{
    @Override
    public void printClub(Club club) {
        System.out.println(club.getId() + " - " + club.getName() + " - " + club.getNumber());
    }

    @Override
    public void printClubRel(ClubRel clubRel) {
        System.out.println(clubRel.getId() + " - " + clubRel.getName() + " - " + clubRel.getNumber() + " - " + clubRel.getRcode());
    }
}
