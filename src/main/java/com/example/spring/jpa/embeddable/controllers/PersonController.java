package com.example.spring.jpa.embeddable.controllers;

import com.example.spring.jpa.embeddable.data.Person;
import com.example.spring.jpa.embeddable.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *
 * <p>Created by irina on 8/31/2021.</p>
 * <p>Project: spring-jpa-embeddable2</p>
 * *
 */
@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;
    @GetMapping("/getByPassNumber/{num}")
    public String getByPassNumber(@PathVariable("num") String num) {
        return "got " + repository.findByPassportNumber(num);
    }

    @GetMapping("/getByCity/{city}")
    public List<Person> getByCity(@PathVariable("city") String city) {
        return repository.findByAddressCity(city);
    }
}
