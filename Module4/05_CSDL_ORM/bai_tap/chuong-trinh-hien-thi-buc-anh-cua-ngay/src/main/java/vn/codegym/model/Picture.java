package vn.codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int point;
    private String author;
    private String comment;

    public Picture() {
    }

    public Picture(int id, int point, String author, String comment) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.comment = comment;
    }

    public Picture(int point, String author, String comment) {
        this.point = point;
        this.author = author;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
