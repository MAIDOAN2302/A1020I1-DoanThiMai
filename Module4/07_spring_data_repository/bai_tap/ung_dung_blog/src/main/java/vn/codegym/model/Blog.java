package vn.codegym.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String content;
    private String author;
    private Date date;
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Blog() {
    }

    public Blog(String name, String content, String author, Date date, Category category) {
        this.name = name;
        this.content = content;
        this.author = author;
        this.date = date;
        this.category = category;
    }

    public Blog(int id, String name, String content, String author, Date date, Category category) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.author = author;
        this.date = date;
        this.category = category;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
