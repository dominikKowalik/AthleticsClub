package model;

/**
 * Created by dominik on 2016-12-22.
 */

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


/**
 * Class that represents main entity
 */


@Entity
@Table(name="klub")
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
    private List<Building> buildingList;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    private List<Employee> employeeList;






}
