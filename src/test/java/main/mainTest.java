package main;

import com.kowalik.dominik.configuration.BeansModel;
import com.kowalik.dominik.main.Main;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Created by dominik on 2016-12-25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeansModel.class})
public class mainTest {

    @Inject
    private Main main;

    @Test
    public void mainTest(){

    }

}
