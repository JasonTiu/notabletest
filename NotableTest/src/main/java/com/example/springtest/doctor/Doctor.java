package com.example.springtest.doctor;

import javax.persistence.*;

@Entity
@Table
public class Doctor {
    @Id
    @SequenceGenerator(
            name = "doctor_sequence",
            sequenceName = "doctor_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "doctor_sequence"
    )

    private Long id;
    private String firstName;
    private String lastName;

    public Doctor() {
    }

    public Doctor(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", first name='" + firstName + '\'' +
                ", last name=" + lastName +
                '}';
    }
}
