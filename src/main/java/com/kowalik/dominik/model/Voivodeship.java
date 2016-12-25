package com.kowalik.dominik.model;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.Set;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name = "wojewodztwa")
@Component
public class Voivodeship {
    @Id
    @Column(name = "id_wojewodztwa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voivodehipId;

    @Basic(optional = false)
    @Column(length = 30, name = "nazwa")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voivodeship")
    @Inject
    private Set<Address> addressSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voivodeship that = (Voivodeship) o;

        if (voivodehipId != null ? !voivodehipId.equals(that.voivodehipId) : that.voivodehipId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return addressSet != null ? addressSet.equals(that.addressSet) : that.addressSet == null;

    }

    @Override
    public int hashCode() {
        int result = voivodehipId != null ? voivodehipId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (addressSet != null ? addressSet.hashCode() : 0);
        return result;
    }

    public Integer getVoivodehipId() {

        return voivodehipId;
    }

    public void setVoivodehipId(Integer voivodehipId) {
        this.voivodehipId = voivodehipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    @Override
    public String toString() {
        return "Voivodeship{" +
                "voivodehipId=" + voivodehipId +
                ", name='" + name + '\'' +
                ", addressSet=" + addressSet +
                '}';
    }
}
