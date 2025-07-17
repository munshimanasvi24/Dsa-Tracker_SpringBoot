package com.example.dsaprac.repository;

import com.example.dsaprac.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findByDateBetween(LocalDate start, LocalDate end);
}
