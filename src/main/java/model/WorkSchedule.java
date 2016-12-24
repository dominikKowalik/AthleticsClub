package model;

import com.sun.javafx.beans.IDProperty;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by dominik on 2016-12-24.
 */

@Entity
@Table(name = "Harmonogramy_pracy")
public class WorkSchedule {

    @Id
    @Column(name = "id_harmonogramu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workScheduleId;

    @Column(name = "czas_rozpoczecia_pracy", nullable = false)
    private LocalDate workStartTime;
    /**
     * length of work in minutes
     */
    @Column(name = "dlugosc_czasu_pracy", nullable = false)
    @Size(min = 1, max = 60 * 24)
    private Integer workLength;

    @ManyToMany(mappedBy = "workScheduleSet")
    @Inject
    private Set<Employee> employeeSet;

    public Integer getWorkScheduleId() {
        return workScheduleId;
    }

    public void setWorkScheduleId(Integer workScheduleId) {
        this.workScheduleId = workScheduleId;
    }

    public LocalDate getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(LocalDate workStartTime) {
        this.workStartTime = workStartTime;
    }

    public Integer getWorkLength() {
        return workLength;
    }

    public void setWorkLength(Integer workLength) {
        this.workLength = workLength;
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

        WorkSchedule that = (WorkSchedule) o;

        if (workScheduleId != null ? !workScheduleId.equals(that.workScheduleId) : that.workScheduleId != null)
            return false;
        if (workStartTime != null ? !workStartTime.equals(that.workStartTime) : that.workStartTime != null)
            return false;
        if (workLength != null ? !workLength.equals(that.workLength) : that.workLength != null) return false;
        return employeeSet != null ? employeeSet.equals(that.employeeSet) : that.employeeSet == null;

    }

    @Override
    public int hashCode() {
        int result = workScheduleId != null ? workScheduleId.hashCode() : 0;
        result = 31 * result + (workStartTime != null ? workStartTime.hashCode() : 0);
        result = 31 * result + (workLength != null ? workLength.hashCode() : 0);
        result = 31 * result + (employeeSet != null ? employeeSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "workScheduleId=" + workScheduleId +
                ", workStartTime=" + workStartTime +
                ", workLength=" + workLength +
                ", employeeSet=" + employeeSet +
                '}';
    }
}
