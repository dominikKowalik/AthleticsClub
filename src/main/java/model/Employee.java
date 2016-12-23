package model;

import javax.persistence.*;
import model.Position;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name = "Pracownicy")
public class Employee{

    @Id
    @Column(name = "id_zawodnika")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Basic(optional = false)
    @Column(name = "imie", length = 30)
    private String firstname;

    @Basic(optional = false)
    @Column(name = "nazwisko", length = 30)
    private String lastName;

    @Basic(optional = false)
    @Column(name = "wyksztalcenie", length = 30)
    private String education;

    @Basic(optional = false)
    @Column(name = "imie_matki", length = 30)
    private String motherName;

    @Basic(optional = false)
    @Column(name = "imie_ojca", length = 30)
    private String fatherName;

    @Basic(optional = false)
    @Column(name = "pesel", length = 30)
    private String pesel;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Basic(optional = false)
    private Club club;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_adresu")
    @Basic(optional = false)
    private Address address;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_stanowiska")
    private Position position;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_konta")
    private Account account;
}
