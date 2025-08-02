package com.uds.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private Patient patient;

    public Appointment(int id, LocalDate date, LocalTime time, Patient patient) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.patient = patient;
    }

    public int getId() { return id; }
    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }
    public Patient getPatient() { return patient; }
}
