package dao;

import com.kowalik.dominik.configuration.BeansDao;
import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.model.Club;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import javax.inject.Inject;
import java.time.LocalDate;

/**
 * Created by dominik on 2016-12-24.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeansDao.class})
public class ClubDaoImplTest {

    @Inject
    ClubDaoImpl clubDao;

    @Test
    public void isSessionFactoryNull(){
        assertNotNull(clubDao.getSessionFactory());
    }

    @Test
    @Rollback(true)
    public void saveTest(){
        Club club = new Club();
        club.setDateOfEstablishment(LocalDate.now());
        club.setName("Legia");
        clubDao.save(club);
        assertEquals(1,clubDao.list().size());
    }

}
