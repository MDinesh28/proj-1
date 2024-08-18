package com.example.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String url;

    // Constructors, Getters, and Setters

    public Project() {}

    public Project(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    // Getters and Setters...
}
