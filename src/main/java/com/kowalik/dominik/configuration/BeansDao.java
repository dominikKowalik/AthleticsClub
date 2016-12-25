package com.kowalik.dominik.configuration;

import com.kowalik.dominik.dao.ClubDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dominik on 2016-12-24.
 */

@Configuration
@ComponentScan({"com.kowalik.dominik"})
public class BeansDao {

   @Bean("entityManagerFactoryBean")
   public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
       LocalEntityManagerFactoryBean localEntityManagerFactoryBean =
               new LocalEntityManagerFactoryBean();
       localEntityManagerFactoryBean.setPersistenceUnitName("SportClubPersistence");
       return localEntityManagerFactoryBean;
   }

    @Bean
    public ClubDaoImpl clubDao(){
        return new ClubDaoImpl();
    }

}
