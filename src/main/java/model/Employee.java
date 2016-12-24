package model;
import javax.inject.Inject;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Set;

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
    @Column(name = "pesel", length = 30, unique = true)
    private String pesel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Basic(optional = false)
    @Inject
    private Club club;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_adresu")
    @Basic(optional = false)
    @Inject
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_stanowiska")
    @Inject
    private Position position;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_konta")
    @Inject
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Pracownicy_Harmonogramy",
            joinColumns={@JoinColumn(name="id_pracownika")},
            inverseJoinColumns={@JoinColumn(name="id_hramonogramu")})
    @Inject
    private Set<WorkSchedule> workScheduleSet;
}

/*
jak ustaić w account ze jak istnieje to musi byc not null
 */
