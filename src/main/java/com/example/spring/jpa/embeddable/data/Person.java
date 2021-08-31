package com.example.spring.jpa.embeddable.data;

import javax.persistence.*;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 8/31/2021.</p>
 * <p>Project: spring-jpa-embeddable2</p>
 * *
 */
@Entity
@Table(name = "person")
public class Person {

    @EmbeddedId
    Passport passport;

    @Embedded
    Address address;

    String name;
    String surname;
    String birthday;
    

    public Person(Passport passport, Address address, String name, String surname, String birthday) {
        this.passport = passport;
        this.address = address;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Person() {

    }

    public Passport getPassport() {
        return passport;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "passport: " + passport.getNumber() + " issued on "+passport.getIssueDate() + " valid until "+passport.getValidUntil()+
                ", address: " + address.getCity() + " "+ address.getStreet()+ " "+ address.getBuilding()+
                ", name: " + name +
                ", surname=" + surname  +
                ", birthday=" + birthday  +
                '}';
    }
}
