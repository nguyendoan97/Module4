package com.codegym.model;

import javax.persistence.*;
import java.sql.Timestamp;
@Table
@Entity
public class ImageComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String author;
    private String feedback;
    private int point;
    private Timestamp date;

    public ImageComment() {
    }

    public ImageComment(String author, String feedback, int point, Timestamp date) {
        this.author = author;
        this.feedback = feedback;
        this.point = point;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
