package com.kowalik.dominik.main;

import com.kowalik.dominik.configuration.BeansDao;
import com.kowalik.dominik.configuration.BeansModel;
import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.model.Account;
import com.kowalik.dominik.model.Club;
import com.kowalik.dominik.model.ClubMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import sun.util.resources.cldr.ar.CalendarData_ar_LY;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dominik on 2016-12-21.
 */

@Component
public class Main {

    private static ClubDaoImpl clubDao;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansModel.class);
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(BeansDao.class);

        ClubMember clubMember = (ClubMember) applicationContext.getBean("clubMember");



        clubDao =  (ClubDaoImpl)applicationContext1.getBean("clubDao");
        Club club = (Club) applicationContext.getBean("club");

        club.setName("teraz");
        club.setDateOfEstablishment(LocalDate.now());

        clubMember.setAge(11);
        clubMember.setFirstName("aaa");
        clubMember.setLastName("bbb");

        Set<ClubMember> clubMemberSet = new HashSet<>();
        clubMemberSet.add(clubMember);

        Account account = new Account();
        account.setLogin("111");
        account.setPassword("222");

        club.setClubMemberSet(clubMemberSet);




        clubDao.save(club);
    }


}
