package com.devops.automation.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greet")
public class GreetController {

    @GetMapping
    public String greet(){
        return "Hi Welcome to Springboot";
    }
}
