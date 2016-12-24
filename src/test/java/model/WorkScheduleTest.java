package model;

import configuration.Beans;
import model.WorkSchedule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import javax.inject.Inject;

/**
 * Created by dominik on 2016-12-24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Beans.class})
public class WorkScheduleTest {

    @Inject
    private WorkSchedule workSchedule;

    @Test
    public void isWorkScheduleNotNull(){
        assertNotNull(workSchedule);
    }

    @Test
    public void isEmployeeSetNotNull(){
        assertNotNull(workSchedule.getEmployeeSet());
    }
}
