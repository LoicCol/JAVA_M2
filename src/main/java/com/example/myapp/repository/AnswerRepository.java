package com.example.myapp.repository;

import com.example.myapp.entity.Answer;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Override
    List<Answer> findAll();

    @Override
    Optional<Answer> findById(Long aLong);

    @Override
    <S extends Answer> S save(S s);

    @Override
    <S extends Answer> List<S> saveAll(Iterable<S> iterable);
}
