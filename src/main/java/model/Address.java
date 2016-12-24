package model;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import org.hibernate.annotations.ListIndexBase;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name="Adresy")
public class Address{

    @Id
    @Column(name = "id_adresu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @Basic(optional = false)
    @Column(name = "numer")
    private Integer number;

    @Basic(optional = false)
    @Column(name = "ulica", length = 30)
    private String street;

    @Basic(optional = false)
    @Column(name = "kod_pocztowy", length = 30)
    private String zipCode;

    @Basic(optional = false)
    @Column(name = "miasto", length = 30)
    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_wojewodztwa")
    @Basic(optional = false)
    private Voivodeship voivodeship;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    @Basic(optional = false)
    @Inject
    private Set<Employee> employeeSet;

}
