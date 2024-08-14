package hospital.entities;

import java.time.LocalDateTime;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime appointmentDateTime;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentDateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public void printDetails() {
        System.out.println("Appointment with Dr. " + doctor.getName() + " for " + patient.getName() + " at " + appointmentDateTime);
    }
}

