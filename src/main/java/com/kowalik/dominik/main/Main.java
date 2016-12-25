package com.kowalik.dominik.main;

import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.model.Club;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

/**
 * Created by dominik on 2016-12-21.
 */
public class Main {
    private static ClubDaoImpl clubDao;

    public static void main(String[] args) {

        clubDao = new ClubDaoImpl();
        Club club = new Club();
        club.setName("aaa");
        club.setDateOfEstablishment(LocalDate.now());
        clubDao.save(club);
    }

    @Autowired
    public void setClubDao(ClubDaoImpl clubDao) {
        Main.clubDao = clubDao;
    }

}
