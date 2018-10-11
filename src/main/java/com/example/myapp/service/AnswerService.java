package com.example.myapp.service;

import com.example.myapp.entity.Answer;
import com.example.myapp.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepositoryItf;

    public AnswerService(AnswerRepository answerRepositoryItf) {
        this.answerRepositoryItf = answerRepositoryItf;
    }

    public List<Answer> getAll() {
        return answerRepositoryItf.findAll();
    }
}
