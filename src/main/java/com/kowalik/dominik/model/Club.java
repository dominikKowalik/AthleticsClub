package com.kowalik.dominik.model;

/**
 * Created by dominik on 2016-12-22.
 */

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


/**
 * Class that represents main entity
 */


@Entity
@Table(name="Klub")
@Component
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
    @Inject
    private Set<Building> buildingList;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> employeeSet;

    @OneToMany(mappedBy = "club", fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> clubMemberSet;


    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public LocalDate getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(Set<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Set<Employee> getClubMemberSet() {
        return clubMemberSet;
    }

    public void setClubMemberSet(Set<Employee> clubMemberSet) {
        this.clubMemberSet = clubMemberSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Club club = (Club) o;

        if (clubId != null ? !clubId.equals(club.clubId) : club.clubId != null) return false;
        if (dateOfEstablishment != null ? !dateOfEstablishment.equals(club.dateOfEstablishment) : club.dateOfEstablishment != null)
            return false;
        if (name != null ? !name.equals(club.name) : club.name != null) return false;
        if (buildingList != null ? !buildingList.equals(club.buildingList) : club.buildingList != null) return false;
        if (employeeSet != null ? !employeeSet.equals(club.employeeSet) : club.employeeSet != null) return false;
        return clubMemberSet != null ? clubMemberSet.equals(club.clubMemberSet) : club.clubMemberSet == null;

    }

    @Override
    public int hashCode() {
        int result = clubId != null ? clubId.hashCode() : 0;
        result = 31 * result + (dateOfEstablishment != null ? dateOfEstablishment.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (buildingList != null ? buildingList.hashCode() : 0);
        result = 31 * result + (employeeSet != null ? employeeSet.hashCode() : 0);
        result = 31 * result + (clubMemberSet != null ? clubMemberSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", dateOfEstablishment=" + dateOfEstablishment +
                ", name='" + name + '\'' +
                ", buildingList=" + buildingList +
                ", employeeSet=" + employeeSet +
                ", clubMemberSet=" + clubMemberSet +
                '}';
    }
}
