package com.kowalik.dominik.model;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */

@Entity
@Table(name = "Zawodnicy")
@Component
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

    public Integer getClubMemberId() {
        return clubMemberId;
    }

    public void setClubMemberId(Integer clubMemberId) {
        this.clubMemberId = clubMemberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Discipline> getDisciplineSet() {
        return disciplineSet;
    }

    public void setDisciplineSet(Set<Discipline> disciplineSet) {
        this.disciplineSet = disciplineSet;
    }

    public Set<TrainingSchedule> getTrainingScheduleSet() {
        return trainingScheduleSet;
    }

    public void setTrainingScheduleSet(Set<TrainingSchedule> trainingScheduleSet) {
        this.trainingScheduleSet = trainingScheduleSet;
    }

    public Set<Achievement> getAchievementSet() {
        return achievementSet;
    }

    public void setAchievementSet(Set<Achievement> achievementSet) {
        this.achievementSet = achievementSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubMember that = (ClubMember) o;

        if (clubMemberId != null ? !clubMemberId.equals(that.clubMemberId) : that.clubMemberId != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (club != null ? !club.equals(that.club) : that.club != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (disciplineSet != null ? !disciplineSet.equals(that.disciplineSet) : that.disciplineSet != null)
            return false;
        if (trainingScheduleSet != null ? !trainingScheduleSet.equals(that.trainingScheduleSet) : that.trainingScheduleSet != null)
            return false;
        return achievementSet != null ? achievementSet.equals(that.achievementSet) : that.achievementSet == null;

    }

    @Override
    public int hashCode() {
        int result = clubMemberId != null ? clubMemberId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (disciplineSet != null ? disciplineSet.hashCode() : 0);
        result = 31 * result + (trainingScheduleSet != null ? trainingScheduleSet.hashCode() : 0);
        result = 31 * result + (achievementSet != null ? achievementSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClubMember{" +
                "clubMemberId=" + clubMemberId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", club=" + club +
                ", account=" + account +
                ", disciplineSet=" + disciplineSet +
                ", trainingScheduleSet=" + trainingScheduleSet +
                ", achievementSet=" + achievementSet +
                '}';
    }
}
