package com.example.portfolio.controller;

import com.example.portfolio.model.Project;
import com.example.portfolio.model.User;
import com.example.portfolio.service.ProjectService;
import com.example.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String home(Model model) {
        User user = userService.getUserDetails();
        List<Project> projects = projectService.getAllProjects();

        model.addAttribute("user", user);
        model.addAttribute("projects", projects);

        return "index";
    }
}
