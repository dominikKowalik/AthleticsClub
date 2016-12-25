package com.kowalik.dominik.model;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-23.
 */
@Entity
@Table(name = "Stanowiska")
@Component
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stanowiska")
    private Integer positionId;

    @Column(name = "nazwa", nullable = false, unique = true)
    private String positionName;

    @Column(name = "opis")
    private String description;

    @OneToMany(mappedBy = "position",fetch = FetchType.LAZY)
    @Inject
    private Set<Employee> employeeSet;


    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (positionId != null ? !positionId.equals(position.positionId) : position.positionId != null) return false;
        if (positionName != null ? !positionName.equals(position.positionName) : position.positionName != null)
            return false;
        if (description != null ? !description.equals(position.description) : position.description != null)
            return false;
        return employeeSet != null ? employeeSet.equals(position.employeeSet) : position.employeeSet == null;

    }

    @Override
    public int hashCode() {
        int result = positionId != null ? positionId.hashCode() : 0;
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (employeeSet != null ? employeeSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                ", description='" + description + '\'' +
                ", employeeSet=" + employeeSet +
                '}';
    }
}
