package model;

import javax.inject.Inject;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlIDREF;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */


@Entity
@Table(name = "Harmonogramy_Trenignow")
public class TrainingSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_treningu")
    private Integer trainingScheduleId;


    @Column(name = "czas_rozpoczecia_treningu", nullable = false)
    private LocalDate trainingStartTime;
    /**
     * length of training in minutes
     */
    @Column(name = "dlugosc_treningu", nullable = false)
    @Size(min = 1, max = 60 * 24)
    private Integer trainingLength;

    /**
     * All club members have inserted at least one training schedule
     */
    @ManyToMany(mappedBy = "trainingScheduleSet")
    @Inject
    private Set<ClubMember> clubMemberSet;
}
