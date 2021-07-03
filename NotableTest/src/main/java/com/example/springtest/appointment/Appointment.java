package com.example.springtest.appointment;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table
public class Appointment {

    @Id
    @SequenceGenerator(
            name = "appointment_sequence",
            sequenceName = "appointment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "appointment_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateTime;
    private String kind;
    private Long docId;

    public Appointment() {
    }

    public Appointment(Long id, String firstName, String lastName, Date dateTime, String kind, Long docId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateTime = dateTime;
        this.kind = kind;
        this.docId = docId;
    }

    public Appointment(String firstName, String lastName, Date dateTime, String kind, Long docId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateTime = dateTime;
        this.kind = kind;
        this.docId = docId;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }
}
