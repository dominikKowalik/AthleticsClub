package com.kowalik.dominik.configuration;

import com.kowalik.dominik.dao.ClubDaoImpl;
import com.kowalik.dominik.main.Main;
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
@ComponentScan({"com.kowalik.dominik.dao"})
public class BeansDao {
    @Bean("localEntityManagerFactoryBean")
    public LocalEntityManagerFactoryBean entityManagerFactoryBean(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
        localEntityManagerFactoryBean.setPersistenceUnitName("SportClubPersistence");
        return localEntityManagerFactoryBean;
    }
}
