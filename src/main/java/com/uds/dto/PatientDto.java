package com.uds.dto;

import com.uds.domain.Patient;

public class PatientDto {
    private final String fullName;
    private final String phoneNumber;
    private final String dateOfBirth;

    public PatientDto(Patient p) {
        this.fullName = p.getFirstName() + " " + p.getLastName();
        this.phoneNumber = p.getPhoneNumber();
        this.dateOfBirth = p.getDateOfBirth().toString();
    }

    public String getFullName() { return fullName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getDateOfBirth() { return dateOfBirth; }
}
