package com.example.restdatajpa.controllers;

import com.example.restdatajpa.entities.Laptop;
import com.example.restdatajpa.repositories.LaptopRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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

    @Operation(summary = "Retrieve all laptops")
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @Operation(summary = "Retrieve a laptop by ID")
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findById(
            @Parameter(description = "The Laptop Long ID") @PathVariable Long id) {

        Optional<Laptop> laptopOpt = laptopRepository.findById(id);

        if (laptopOpt.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(laptopOpt.get());
    }

    @Operation(summary = "Create new laptop")
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop) {
        if(laptop.getId() != null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(laptopRepository.save(laptop));
    }

    @Operation(summary = "Update a laptop")
    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if(laptop.getId() == null)
            return ResponseEntity.badRequest().build();

        if (!laptopRepository.existsById(laptop.getId()))
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(laptopRepository.save(laptop));

    }

    @Operation(summary = "Delete a laptop by ID")
    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){

        if(!laptopRepository.existsById(id))
            return ResponseEntity.notFound().build();

        laptopRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Delete all laptops")
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
