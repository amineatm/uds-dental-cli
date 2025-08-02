package com.uds.dto;

import com.uds.domain.Appointment;

public class AppointmentDto {
    private final int id;
    private final String date;
    private final String time;
    private final PatientDto patient;

    public AppointmentDto(Appointment a) {
        this.id = a.getId();
        this.date = a.getDate().toString();
        this.time = a.getTime().toString();
        this.patient = new PatientDto(a.getPatient());
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public PatientDto getPatient() {
        return patient;
    }
}
