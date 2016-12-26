package com.kowalik.dominik.main;

import com.kowalik.dominik.configuration.BeansDao;
import com.kowalik.dominik.configuration.BeansModel;
import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.dao.ClubMemberDaoImpl;
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
    public static void main(String[] args) {
    }
}
