package model;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-23.
 */
@Entity
@Table(name = "Stanowiska")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stanowiska")
    private Integer positionId;

    @Column(name = "nazwa", nullable = false, unique = true)
    private String positionName;

    @Column(name = "opis")
    private String description;

    @OneToMany(mappedBy = "position",fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> employeeSet;



}
