package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dominik on 2016-12-22.
 */

@Configuration
@ComponentScan
public class Beans {

    @Bean
    @Scope("prototype")
    public EntityManagerFactory entityManagerFactory(){
        return Persistence.createEntityManagerFactory("SportClubPersistence");
    }


}
