package model;
import javax.persistence.*;
import java.util.List;

/**
 * Created by dominik on 2016-12-22.
 */

@Entity
@Table(name = "wojewodztwa")
public class Voivodeship {

    @Id
    @Column(name = "id_wojewodztwa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voivodehipId;

    @Basic(optional = false)
    @Column(length = 30, name = "nazwa")
    private String name;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voivodeship")
    private List<Address> addressList;
}
