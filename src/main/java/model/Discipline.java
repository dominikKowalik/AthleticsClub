package model;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */

@Entity
@Table(name = "Dyscypliny")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dyscypliny")
    private Integer disciplineId;

    @Column(name = "nazwa", length = 30, unique = true, nullable = false)
    private String name;

    @Column(name = "opis", length = 300)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplineSet")
    @Inject
    private Set<ClubMember> clubMemberSet;
}
