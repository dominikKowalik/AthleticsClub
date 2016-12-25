package com.kowalik.dominik.dao;

import com.kowalik.dominik.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;

/**
 * Created by dominik on 2016-12-22.
 */

@Repository
public class ClubDaoImpl implements CRUDinterface<Club> {

    @PersistenceUnit
    @Qualifier("entityManagerFactoryBean")
    private EntityManagerFactory entityManagerFactoryBean;

    @Override
    public void save(Club club) {
        EntityManager entityManager = entityManagerFactoryBean.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(club);
        transaction.commit();
        entityManager.close();
    }

    @Override
    public List<Club> list() {
        EntityManager entityManager =entityManagerFactoryBean.createEntityManager();
        List clubList = entityManager.createQuery("select k from Klub k").getResultList();
        entityManager.close();
        return clubList;
    }
}
