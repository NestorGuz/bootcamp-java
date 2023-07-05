package com.example.restdatajpa;

import com.example.restdatajpa.entities.Laptop;
import com.example.restdatajpa.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;


@SpringBootApplication
public class RestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(RestDatajpaApplication.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "DELL", "Inspiron 14R", "Intel Core i7-1165G7", 8, 500, 14.0, 4.10, 400.0, true, LocalDate.of(2012, 01, 10));
		Laptop laptop2 = new Laptop(null, "HP", "Note Book 15", "AMD Ryzen 7 4700U", 4, 1000, 15.0, 3.0, 300.0, false, LocalDate.of(2015, 10, 21));

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
	}

}
