package com.example.restdatajpa.controllers;

import com.example.restdatajpa.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {
    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int serverPort;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + serverPort);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void findAll() {
        ResponseEntity<Laptop[]> response = testRestTemplate.getForEntity("/api/laptops", Laptop[].class);

        System.out.println(response.getStatusCode());

        assertEquals(response.getStatusCode(), HttpStatus.OK);

        List<Laptop> laptops = Arrays.asList(response.getBody());

        System.out.println(laptops.size());
    }

    @Test
    void findById() {
        Random rand = new Random();
        long randId  = rand.nextLong();

        ResponseEntity<Laptop> response = testRestTemplate.getForEntity("/api/laptop/" + randId, Laptop.class);

        assertTrue(response.getStatusCode() == HttpStatus.OK || response.getStatusCode() == HttpStatus.NOT_FOUND);

        System.out.println(randId);
        System.out.println(response.getStatusCode());
    }

    @Test
    void create() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "brand": "Apple",
                    "model": "MacBook Pro",
                    "processor": "Apple M1",
                    "storageCapacity": 256,
                    "screenSize": 13.3,
                    "weight": 2.8,
                    "price": 1299,
                    "releaseDate": "2021-09-05",
                    "ram": 8,
                    "hasCDReader": false
                }
                """;
        HttpEntity<String> request = new HttpEntity<>(json, headers);

        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        Laptop laptop = response.getBody();

        assertTrue(response.getStatusCode() == HttpStatus.OK || response.getStatusCode() == HttpStatus.BAD_REQUEST);
        assertNotNull(laptop);
        assertNotNull(laptop.getId());
    }

    @Test
    void update() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "id": 1,
                    "brand": "Apple",
                    "model": "MacBook Pro",
                    "processor": "Apple M1",
                    "storageCapacity": 256,
                    "screenSize": 13.3,
                    "weight": 2.8,
                    "price": 1299,
                    "releaseDate": "2021-09-05",
                    "ram": 8,
                    "hasCDReader": true
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json, headers);

        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.PUT, request, Laptop.class);

        System.out.println(response.getStatusCode());

        Laptop laptop = response.getBody();

        assertTrue(response.getStatusCode() == HttpStatus.OK || response.getStatusCode() == HttpStatus.BAD_REQUEST || response.getStatusCode() == HttpStatus.NOT_FOUND);
    }

    @Test
    void delete() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> request = new HttpEntity<>("", headers);

        Random rand = new Random();
        long randId  = rand.nextLong();

        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops/" + randId, HttpMethod.DELETE, request, Laptop.class);

        System.out.println(response.getStatusCode());

        assertTrue(response.getStatusCode() == HttpStatus.NOT_FOUND || response.getStatusCode() == HttpStatus.NO_CONTENT);
    }

    @Test
    void deleteAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> request = new HttpEntity<>("", headers);

        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, request, Laptop.class);

        System.out.println(response.getStatusCode());

        assertEquals(response.getStatusCode(), HttpStatus.NO_CONTENT);
    }
}