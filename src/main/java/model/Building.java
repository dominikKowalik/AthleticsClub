package model;

import javax.inject.Inject;
import javax.persistence.*;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name="Obiekty")
public class Building {

    @Id
    @Column(name = "id_obiektu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingId;

    @Basic(optional = false)
    @Column(name = "nazwa", length = 30)
    private String name;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "nr_telefonu", length = 30)
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klubu")
    @Basic(optional = false)
    @Inject
    private Club club;


    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        if (buildingId != null ? !buildingId.equals(building.buildingId) : building.buildingId != null) return false;
        if (name != null ? !name.equals(building.name) : building.name != null) return false;
        if (email != null ? !email.equals(building.email) : building.email != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(building.phoneNumber) : building.phoneNumber != null)
            return false;
        return club != null ? club.equals(building.club) : building.club == null;

    }

    @Override
    public int hashCode() {
        int result = buildingId != null ? buildingId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (club != null ? club.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingId=" + buildingId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", club=" + club +
                '}';
    }
}
