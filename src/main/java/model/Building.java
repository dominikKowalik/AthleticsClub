package model;

import javax.persistence.*;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name="Obiekty")
public class Building {

    @Id
    @Column(name = "id_obiektu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingId;

    @Basic(optional = false)
    @Column(name = "nazwa", length = 30)
    private String name;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "nr_telefonu", length = 30)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Basic(optional = false)
    private Club club;



}
