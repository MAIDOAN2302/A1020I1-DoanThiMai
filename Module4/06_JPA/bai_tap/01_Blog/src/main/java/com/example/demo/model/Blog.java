package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Blog {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String type;
        private String author;
        private String description;
        @ManyToOne(targetEntity = ECommerce.class)
        private  ECommerce eCommerce;

        public Blog(int id, String type, String author, String description) {
            this.id = id;
            this.type = type;
            this.author = author;
            this.description = description;
        }

        public Blog() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ECommerce geteCommerce() {
            return eCommerce;
        }

        public void seteCommerce(ECommerce eCommerce) {
            this.eCommerce = eCommerce;
        }
}
