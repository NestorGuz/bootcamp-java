package com.example.restdatajpa.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message}")
    String message;

    /**
     * localhost:8081/api/hello
     * @return
     */
    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello everyone!! from " + message;
    }
}
