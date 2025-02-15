package com.example.demo.model;

import java.time.LocalDate;

public class Post {

    private String text;
    private Integer likes;
    private LocalDate creationDate;

    public Post(String text) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }

}
