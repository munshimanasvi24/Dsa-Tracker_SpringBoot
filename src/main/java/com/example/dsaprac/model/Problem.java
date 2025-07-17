package com.example.dsaprac.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate date;
    private String tag;
    private String difficulty;
    private String platform;

    // Constructors
    public Problem() {}

    public Problem(String title, LocalDate date, String tag, String difficulty, String platform) {
        this.title = title;
        this.date = date;
        this.tag = tag;
        this.difficulty = difficulty;
        this.platform = platform;
    }

    // Getters & setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public String getTag() { return tag; }

    public void setTag(String tag) { this.tag = tag; }

    public String getDifficulty() { return difficulty; }

    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public String getPlatform() { return platform; }

    public void setPlatform(String platform) { this.platform = platform; }
}
