package vn.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "serviceType")
    private Set<Service> services;
}
