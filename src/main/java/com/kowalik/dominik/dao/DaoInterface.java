package com.kowalik.dominik.dao;

import com.kowalik.dominik.configuration.BeansDao;
import com.kowalik.dominik.model.Club;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by dominik on 2016-12-24.
 */

/**
 * interface that force implementation methods included in classes from dao package
 *
 * @param <t>
 */
public interface DaoInterface<t> {

    String getClassName();



    default void save(t t) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(t);
        transaction.commit();
        entityManager.close();
    }

    default List<t> list() {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        List<t> clubList = entityManager.createQuery("select k from " + getClassName() + " k").getResultList();
        entityManager.close();
        return clubList;
    }

    default t getById(int id) throws ClassNotFoundException {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        t club = (t) session.get(Class.forName(getClassName()), id);
        session.close();
        return club;
    }

    default void remove(int id) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            t t = (t) session.get(Class.forName(getClassName()), id);
            session.delete(t);
            transaction.commit();
        } catch (Exception e) {
            if (!Objects.equals(null, transaction)) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    default public void update(t t) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            if (!Objects.equals(null, transaction)) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    default EntityManagerFactory getEntityManagerFactory() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansDao.class);
        return (EntityManagerFactory) applicationContext.getBean("localEntityManagerFactoryBean");
    }

}
