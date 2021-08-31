package com.example.spring.jpa.embeddable.data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * *
 * <p>Created by irina on 8/31/2021.</p>
 * <p>Project: spring-jpa-embeddable2</p>
 * *
 */
public class Passport implements Serializable {

    @Column(name = "passport_number")
    String number;
    @Column(name = "valid_from")
    String issueDate;
    @Column(name = "valid_until")
    String validUntil;

    public Passport() {
    }

    public Passport(String number, String issueDate, String validUntil) {
        this.number = number;
        this.issueDate = issueDate;
        this.validUntil = validUntil;
    }

    public String getNumber() {
        return number;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getValidUntil() {
        return validUntil;
    }
}
