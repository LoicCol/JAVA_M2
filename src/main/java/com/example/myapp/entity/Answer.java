package com.example.myapp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Answer {
    @Id
    private int id;
    @GeneratedValue
    private String value;
}
