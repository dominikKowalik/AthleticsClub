package model;

import javax.inject.Inject;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */

@Entity
@Table(name = "Zawodnicy")
public class ClubMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zawodnika")
    private Integer clubMemberId;

    @Column(name = "imie", length = 30, nullable = false)
    private String firstName;

    @Column(name = "nazwisko", length = 30, nullable = false)
    private String lastName;

    @Column(name = "wiek", length = 30, nullable = false)
    @Size(min = 10, max = 99)
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Inject
    private Club club;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_konta")
    @Inject
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Zawodnicy_Dyscypliny",
            joinColumns = {@JoinColumn(name = "id_zawodnika")},
            inverseJoinColumns = {@JoinColumn(name = "id_pracownika")})
    @Inject
    private Set<Discipline> disciplineSet;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "Zawodnicy_Harmonogramy",
            joinColumns = {@JoinColumn(name = "id_zawodnika")},
            inverseJoinColumns = {@JoinColumn(name = "id_harmonogramu")})
    @Inject
    private Set<TrainingSchedule> trainingScheduleSet;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clubMember")
    @Inject
    private Set<Achievement> achievementSet;
}
