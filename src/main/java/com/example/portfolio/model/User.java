package com.example.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String aboutMe;

    // Constructors, Getters, and Setters

    public User() {}

    public User(String name, String role, String aboutMe) {
        this.name = name;
        this.role = role;
        this.aboutMe = aboutMe;
    }

    // Getters and Setters...
}
