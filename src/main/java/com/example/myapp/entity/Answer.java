package com.example.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    private long id;

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @GeneratedValue
    private String value;
}
