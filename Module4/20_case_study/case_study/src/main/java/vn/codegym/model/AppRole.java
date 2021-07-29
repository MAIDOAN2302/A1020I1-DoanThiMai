package vn.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "appRole")
    private Set<UserRole> userRoles;
}
