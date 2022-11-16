package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble!";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "Biarritz, Bordeaux, Lille, Lyon, Marseille, Montpellier, Nantes, Paris, Reims, Strasbourg, Toulouse, Tours";
    }
}
