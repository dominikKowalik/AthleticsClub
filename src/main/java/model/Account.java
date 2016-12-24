package model;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-23.
 */

@Entity
@Table(name = "Konta")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Basic(optional = false)
    @Column(name = "nazwa_uzytkownika", length = 30)
    private String login;

    @Basic(optional = false)
    @Column(name = "haslo", length = 30)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private Set<Employee> employeeSet;
}


