package model;

import javax.persistence.*;

/**
 * Created by dominik on 2016-12-23.
 */

@Entity
@Table(name = "konta")
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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
    @Basic(optional = false)
    private Employee employee;



}
