package com.codegym.gio_hang.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private int id;
    private String name;
    private double price;
    private String imageURL;

    public Item() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public  boolean equal(Object object){
        if (object instanceof Item){
            Item anotherItem = (Item) object;
            if (this.id == anotherItem.id){
                return  true;
            }
        }
        return false;
    }

    public  int hashCode(){
        return this.id;
    }
}
