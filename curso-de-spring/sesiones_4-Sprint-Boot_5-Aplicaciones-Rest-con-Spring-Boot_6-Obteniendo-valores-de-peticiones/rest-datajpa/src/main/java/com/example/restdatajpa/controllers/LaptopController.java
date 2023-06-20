package com.example.restdatajpa.controllers;

import com.example.restdatajpa.entities.Laptop;
import com.example.restdatajpa.repositories.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findById(@PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);

        if (laptopOpt.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(laptopOpt.get());
    }

    @PostMapping("/api/laptops")
    public Laptop save(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
