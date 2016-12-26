package com.kowalik.dominik.web;

import com.kowalik.dominik.dao.AccountDaoImpl;
import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.model.Account;
import com.kowalik.dominik.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by dominik on 2016-12-26.
 */


@RequestMapping("/")
@RestController
public class Controller {

    @Inject
    ClubDaoImpl clubDao;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Club>> aaa() {
        return new ResponseEntity(clubDao.list(), HttpStatus.OK);
    }
}
