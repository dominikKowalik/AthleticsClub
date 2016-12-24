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

    public Integer getTrainingScheduleId() {
        return trainingScheduleId;
    }

    public void setTrainingScheduleId(Integer trainingScheduleId) {
        this.trainingScheduleId = trainingScheduleId;
    }

    public LocalDate getTrainingStartTime() {
        return trainingStartTime;
    }

    public void setTrainingStartTime(LocalDate trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    public Integer getTrainingLength() {
        return trainingLength;
    }

    public void setTrainingLength(Integer trainingLength) {
        this.trainingLength = trainingLength;
    }

    public Set<ClubMember> getClubMemberSet() {
        return clubMemberSet;
    }

    public void setClubMemberSet(Set<ClubMember> clubMemberSet) {
        this.clubMemberSet = clubMemberSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainingSchedule that = (TrainingSchedule) o;

        if (trainingScheduleId != null ? !trainingScheduleId.equals(that.trainingScheduleId) : that.trainingScheduleId != null)
            return false;
        if (trainingStartTime != null ? !trainingStartTime.equals(that.trainingStartTime) : that.trainingStartTime != null)
            return false;
        if (trainingLength != null ? !trainingLength.equals(that.trainingLength) : that.trainingLength != null)
            return false;
        return clubMemberSet != null ? clubMemberSet.equals(that.clubMemberSet) : that.clubMemberSet == null;

    }

    @Override
    public int hashCode() {
        int result = trainingScheduleId != null ? trainingScheduleId.hashCode() : 0;
        result = 31 * result + (trainingStartTime != null ? trainingStartTime.hashCode() : 0);
        result = 31 * result + (trainingLength != null ? trainingLength.hashCode() : 0);
        result = 31 * result + (clubMemberSet != null ? clubMemberSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TrainingSchedule{" +
                "trainingScheduleId=" + trainingScheduleId +
                ", trainingStartTime=" + trainingStartTime +
                ", trainingLength=" + trainingLength +
                ", clubMemberSet=" + clubMemberSet +
                '}';
    }
}
