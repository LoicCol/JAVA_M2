package com.example.myapp.service;

import com.example.myapp.repository.AnswerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Service
public class AnswerService {
    private AnswerRepository answerRepository;

    public AnswerService () {
        this.answerRepository = new AnswerRepository();
    }

    public List<String> getAll() {
        return answerRepository.getAll();
    }

    public void create(String answer) {
        answerRepository.create(answer);
    }
}
