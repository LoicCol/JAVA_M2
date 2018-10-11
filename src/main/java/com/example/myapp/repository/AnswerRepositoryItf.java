package com.example.myapp.repository;

import com.example.myapp.entity.Answer;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepositoryItf extends JpaRepository<Answer, Long> {

}
