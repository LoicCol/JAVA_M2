package com.example.myapp.service;

import com.example.myapp.entity.Answer;
import com.example.myapp.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Answer saveAnswer(Answer answer) { return answerRepositoryItf.save(answer); }

    public Optional<Answer> findById(long id) { return answerRepositoryItf.findById(id); }
}
