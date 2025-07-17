package com.example.dsaprac.controller;

import com.example.dsaprac.model.Problem;
import com.example.dsaprac.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/problems")
@CrossOrigin(origins = "http://localhost:3000")
public class ProblemController {

    @Autowired
    private ProblemRepository repository;

    // POST: Add a new problem
    @PostMapping
    public Problem addProblem(@RequestBody Problem problem) {
        return repository.save(problem);
    }

    // GET: Fetch all logged problems
    @GetMapping
    public List<Problem> getAllProblems() {
        return repository.findAll();
    }

    // GET: Weekly summary by difficulty
    @GetMapping("/summary/week")
    public Map<String, Long> getWeeklySummary() {
        LocalDate today = LocalDate.now();
        LocalDate weekStart = today.minusDays(6);

        List<Problem> problems = repository.findByDateBetween(weekStart, today);

        return problems.stream()
                .collect(Collectors.groupingBy(Problem::getDifficulty, Collectors.counting()));
    }
}
