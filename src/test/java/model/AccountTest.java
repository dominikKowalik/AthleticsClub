package model;

import com.kowalik.dominik.configuration.BeansModel;
import com.kowalik.dominik.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by dominik on 2016-12-24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeansModel.class})
public class AccountTest {

    @Inject
    Account account;

    @Test
    public void isAccountNotNull(){

    }
}
