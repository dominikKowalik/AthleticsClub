package model;
import javax.inject.Inject;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Set;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name = "Pracownicy")
public class Employee{

    @Id
    @Column(name = "id_zawodnika")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Basic(optional = false)
    @Column(name = "imie", length = 30)
    private String firstname;

    @Basic(optional = false)
    @Column(name = "nazwisko", length = 30)
    private String lastName;

    @Basic(optional = false)
    @Column(name = "wyksztalcenie", length = 30)
    private String education;

    @Basic(optional = false)
    @Column(name = "imie_matki", length = 30)
    private String motherName;

    @Basic(optional = false)
    @Column(name = "imie_ojca", length = 30)
    private String fatherName;

    @Basic(optional = false)
    @Column(name = "pesel", length = 30, unique = true)
    private String pesel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Basic(optional = false)
    @Inject
    private Club club;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_adresu")
    @Basic(optional = false)
    @Inject
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_stanowiska")
    @Inject
    private Position position;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_konta")
    @Inject
    private Account account;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Pracownicy_Harmonogramy",
            joinColumns={@JoinColumn(name="id_pracownika")},
            inverseJoinColumns={@JoinColumn(name="id_hramonogramu")})
    @Inject
    private Set<WorkSchedule> workScheduleSet;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<WorkSchedule> getWorkScheduleSet() {
        return workScheduleSet;
    }

    public void setWorkScheduleSet(Set<WorkSchedule> workScheduleSet) {
        this.workScheduleSet = workScheduleSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeId != null ? !employeeId.equals(employee.employeeId) : employee.employeeId != null) return false;
        if (firstname != null ? !firstname.equals(employee.firstname) : employee.firstname != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (education != null ? !education.equals(employee.education) : employee.education != null) return false;
        if (motherName != null ? !motherName.equals(employee.motherName) : employee.motherName != null) return false;
        if (fatherName != null ? !fatherName.equals(employee.fatherName) : employee.fatherName != null) return false;
        if (pesel != null ? !pesel.equals(employee.pesel) : employee.pesel != null) return false;
        if (club != null ? !club.equals(employee.club) : employee.club != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        if (position != null ? !position.equals(employee.position) : employee.position != null) return false;
        if (account != null ? !account.equals(employee.account) : employee.account != null) return false;
        return workScheduleSet != null ? workScheduleSet.equals(employee.workScheduleSet) : employee.workScheduleSet == null;

    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (motherName != null ? motherName.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (workScheduleSet != null ? workScheduleSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education='" + education + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", club=" + club +
                ", address=" + address +
                ", position=" + position +
                ", account=" + account +
                ", workScheduleSet=" + workScheduleSet +
                '}';
    }
}

/*
jak ustaić w account ze jak istnieje to musi byc not null
 */
