package com.example.myapp.resource;

import com.example.myapp.entity.Answer;
import com.example.myapp.service.AnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("/answers")
public class AnswerResource {
    public AnswerResource (AnswerService answerService) {
        this.answerService = answerService;
    }

    private AnswerService answerService;

    @RequestMapping(method = GET)
    public List<Answer> getAll() { return answerService.getAll(); }

    @RequestMapping(method = POST)
    public Answer newAnswer(@RequestBody Answer answer) {
        return answerService.saveAnswer(answer);
    }

    @RequestMapping(method = GET, path = "/answers/{id}")
    public ResponseEntity<Answer> findById(@PathVariable Long id) {
        Optional<Answer> answer =  answerService.findById(id);
        return answer.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
