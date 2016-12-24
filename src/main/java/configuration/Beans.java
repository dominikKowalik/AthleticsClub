package configuration;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Bean
    @Scope("prototype")
    public WorkSchedule workSchedule(){
        return new WorkSchedule();
    }

    @Bean
    @Scope("prototype")
    public Set<Account> accountSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Address> addressSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Building> buildingSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Club> clubSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Employee> employeeSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Position> positionSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<Voivodeship> voivodeshipSet(){
        return new HashSet<>();
    }

    @Bean
    @Scope("prototype")
    public Set<WorkSchedule> workScheduleSet(){
        return new HashSet<>();
    }
}
