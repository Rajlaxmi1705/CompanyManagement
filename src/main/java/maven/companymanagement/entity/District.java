package maven.companymanagement.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany
    private List<Taluka> talukas;
    public District() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Taluka> getTalukas() {
        return talukas;
    }

    public void setTalukas(List<Taluka> talukas) {
        this.talukas = talukas;
    }

    @Override
    public String toString() {
        return "District [id=" + id
                + ", name=" + name + "]";
    }
}