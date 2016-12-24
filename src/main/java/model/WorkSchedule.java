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
@Service
public class WorkSchedule {

    @Id
    @Column(name = "id_harmonogramu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workScheduleId;


    @Column(name = "Harmonogramy_Pracy", nullable = false)
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
}
