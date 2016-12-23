package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Created by dominik on 2016-12-21.
 */
public class Main {


    private static EntityManagerFactory emFactory;

    static {
        emFactory = Persistence.createEntityManagerFactory("SportClubPersistence");
    }

    public static void main(String[] args) {
        EntityManager entityManager = emFactory.createEntityManager();
        entityManager.close();
        emFactory.close();
    }
}
