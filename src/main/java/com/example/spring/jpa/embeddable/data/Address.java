package com.example.spring.jpa.embeddable.data;

import javax.persistence.Embeddable;

/**
 * *
 * <p>Created by irina on 8/31/2021.</p>
 * <p>Project: spring-jpa-embeddable2</p>
 * *
 */
//@Embeddable
public class Address {

    String city;
    String street;
    String building;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
