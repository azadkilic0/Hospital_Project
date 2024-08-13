package entities;

import java.time.LocalDate;

public class Patient extends Person {
    private String patientId;
    private LocalDate admissionDate;

    public Patient(String name, LocalDate birthDate, String patientId, LocalDate admissionDate) {
        super(name, birthDate);
        this.patientId = patientId;
        this.admissionDate = admissionDate;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public void printDetails() {
        System.out.println("Patient: " + getName() + ", Admission Date: " + admissionDate);
    }
}

