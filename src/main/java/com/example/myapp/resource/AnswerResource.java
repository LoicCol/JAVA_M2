package com.example.myapp.resource;

import com.example.myapp.entity.Answer;
import com.example.myapp.service.AnswerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController()
public class AnswerResource {
    public AnswerResource (AnswerService answerService) {
        this.answerService = answerService;
    }

    private AnswerService answerService;

    @RequestMapping("/answers")
    public List<Answer> getAll() { return answerService.getAll(); }

}
