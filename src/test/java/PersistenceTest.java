import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dominik on 2016-12-22.
 */
public class PersistenceTest {

    EntityManagerFactory sportClubPersistence;

    @Test
    public void entityManagerTest() {
        EntityManager entityManager = sportClubPersistence.createEntityManager();
        assertNotNull(entityManager);
    }

    @Autowired
    public void setSportClubPersistence(EntityManagerFactory sportClubPersistence) {
        this.sportClubPersistence = sportClubPersistence;
    }
}

