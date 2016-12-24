package model;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import org.hibernate.annotations.ListIndexBase;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name="Adresy")
public class Address{

    @Id
    @Column(name = "id_adresu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @Basic(optional = false)
    @Column(name = "numer")
    private Integer number;

    @Basic(optional = false)
    @Column(name = "ulica", length = 30)
    private String street;

    @Basic(optional = false)
    @Column(name = "kod_pocztowy", length = 30)
    private String zipCode;

    @Basic(optional = false)
    @Column(name = "miasto", length = 30)
    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_wojewodztwa")
    @Basic(optional = false)
    @Inject
    private Voivodeship voivodeship;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    @Basic(optional = false)
    @Inject
    private Set<Employee> employeeSet;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Voivodeship getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(Voivodeship voivodeship) {
        this.voivodeship = voivodeship;
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

        Address address = (Address) o;

        if (addressId != null ? !addressId.equals(address.addressId) : address.addressId != null) return false;
        if (number != null ? !number.equals(address.number) : address.number != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (zipCode != null ? !zipCode.equals(address.zipCode) : address.zipCode != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (voivodeship != null ? !voivodeship.equals(address.voivodeship) : address.voivodeship != null) return false;
        return employeeSet != null ? employeeSet.equals(address.employeeSet) : address.employeeSet == null;

    }

    @Override
    public int hashCode() {
        int result = addressId != null ? addressId.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (voivodeship != null ? voivodeship.hashCode() : 0);
        result = 31 * result + (employeeSet != null ? employeeSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", number=" + number +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", voivodeship=" + voivodeship +
                ", employeeSet=" + employeeSet +
                '}';
    }
}
