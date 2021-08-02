package vn.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "serviceType")
    private Set<Service> services;

    public ServiceType() {
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

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
