package com.example.restdatajpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * localhost:8081/api/hello
     * @return
     */
    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello everyone!!";
    }
}
