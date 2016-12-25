package com.kowalik.dominik.model;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */

@Entity
@Table(name = "Dyscypliny")
@Component
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

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        Discipline that = (Discipline) o;

        if (disciplineId != null ? !disciplineId.equals(that.disciplineId) : that.disciplineId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return clubMemberSet != null ? clubMemberSet.equals(that.clubMemberSet) : that.clubMemberSet == null;

    }

    @Override
    public int hashCode() {
        int result = disciplineId != null ? disciplineId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (clubMemberSet != null ? clubMemberSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "disciplineId=" + disciplineId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", clubMemberSet=" + clubMemberSet +
                '}';
    }
}
