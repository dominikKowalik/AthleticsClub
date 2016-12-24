package model;

import javax.persistence.*;

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

}
