package com.example.portfolio.service;

import com.example.portfolio.model.User;
import com.example.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserDetails() {
        return userRepository.findById(1L).orElse(new User("Your Name", "DevOps Engineer", "About Me"));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
