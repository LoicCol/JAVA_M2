package com.example.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @GeneratedValue
    private String value;
}
