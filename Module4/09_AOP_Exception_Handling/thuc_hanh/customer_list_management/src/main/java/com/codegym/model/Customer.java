package com.codegym.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String address;

    @ManyToOne(targetEntity = Province.class)
    private Province province;

    public Customer() {
    }

    public Customer(String name, String email, String address, Province province) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.province = province;
    }

    public Customer(int id, String name, String email, String address, Province province) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.province = province;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
