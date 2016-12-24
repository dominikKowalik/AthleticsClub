package model;

/**
 * Created by dominik on 2016-12-22.
 */

import javax.inject.Inject;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;


/**
 * Class that represents main entity
 */


@Entity
@Table(name="Klub")
public class Club {

    @Id
    @Column(name = "id_klubu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clubId;

    @Basic(optional = false)
    @Column(name = "rok_zalozenia")
    private LocalDate dateOfEstablishment;

    @Basic(optional = false)
    @Column(name = "nazwa", length = 30)
    private String name;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    @Inject
    private Set<Building> buildingList;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> employeeSet;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> clubMemberSet;




}
