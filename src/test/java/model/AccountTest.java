package model;

import configuration.Beans;
import model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by dominik on 2016-12-24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Beans.class})
public class AccountTest {

    @Inject
    Account account;

    @Test
    public void isAccountNotNull(){

    }
}
