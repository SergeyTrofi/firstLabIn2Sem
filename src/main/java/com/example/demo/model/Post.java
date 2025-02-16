package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

public class Post {

    private String text;
    private Integer likes;
    private Date creationDate;
    private Integer id;

    public Post(String text) {
        this.text = text;
        this.likes = 0;
        this.creationDate = new Date();
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Integer getId(){
        return id;
    }

}
