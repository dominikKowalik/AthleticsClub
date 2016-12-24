package model;

import javax.inject.Inject;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */
@Entity
@Table(name  = "Osiagniecia")
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_osiagniecia")
    private Integer achievementId;

    @Column(name = "data", nullable = false)
    private LocalDate date;

    @Column(name = "miejsce", nullable = false)
    private Integer position;

    @Column(name = "nazwa_zawodow", nullable = false)
    private String eventName;

    @Column(name = "miejscowosc", nullable = false)
    private String locality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_zawodnika", nullable = false)
    @Inject
    private ClubMember clubMember;
}
