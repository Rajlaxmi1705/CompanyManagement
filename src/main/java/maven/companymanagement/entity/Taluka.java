package maven.companymanagement.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Taluka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    private List<Town> towns;

    public Taluka() {
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

    public List<Town> getTowns() {
        return towns;
    }

    public void setTowns(List<Town> towns) {
        this.towns = towns;
    }

    @Override
    public String toString() {
        return "Taluka [id=" + id
                + ", name=" + name + "]";
    }
}