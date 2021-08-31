package com.example.spring.jpa.embeddable.repository;

import com.example.spring.jpa.embeddable.data.Passport;
import com.example.spring.jpa.embeddable.data.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 8/31/2021.</p>
 * <p>Project: spring-jpa-embeddable2</p>
 * *
 */
public interface PersonRepository extends CrudRepository<Person, Passport> {

    List<Person> findByPassportNumber(String passport_number);
    List<Person> findByAddressCity(String address_city);
}
