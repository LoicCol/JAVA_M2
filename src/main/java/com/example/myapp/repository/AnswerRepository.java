package com.example.myapp.repository;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class AnswerRepository {
    private Map<Integer, String> DATABASE;

    static int iterator = 0;

    public AnswerRepository () {
        DATABASE = new HashMap<Integer, String>();
    }

    public List<String> getAll() {
        return new ArrayList<String>(DATABASE.values());
    }

    public void create(String answer) {
        DATABASE.put(DATABASE.size() + 1, answer);
    }
}
