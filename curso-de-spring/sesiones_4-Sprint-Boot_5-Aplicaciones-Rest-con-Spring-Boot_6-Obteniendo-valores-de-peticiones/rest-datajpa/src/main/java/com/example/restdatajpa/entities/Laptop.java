package com.example.restdatajpa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String processor;
    private Integer RAM;
    private Integer storageCapacity;
    private Double screenSize;
    private Double weight;
    private Double price;
    private Boolean hasCDReader;
    private LocalDate releaseDate;

    public Laptop() {
    }

    public Laptop(Long id, String brand, String model, String processor, Integer RAM, Integer storageCapacity, Double screenSize, Double weight, Double price, Boolean hasCDReader, LocalDate releaseDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.RAM = RAM;
        this.storageCapacity = storageCapacity;
        this.screenSize = screenSize;
        this.weight = weight;
        this.price = price;
        this.hasCDReader = hasCDReader;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.toUpperCase();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty(value="hasCDReader")
    public Boolean hasCDReader() {
        return hasCDReader;
    }

    public void setHasCDReader(Boolean hasCDReader) {
        this.hasCDReader = hasCDReader;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
