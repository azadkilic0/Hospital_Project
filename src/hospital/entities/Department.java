package hospital.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added to " + name + ": " + patient.getName());
    }

    public void removePatient(Patient patient) {
        if (patients.remove(patient)) {
            System.out.println("Patient removed from " + name + ": " + patient.getName());
        } else {
            System.out.println("Patient not found in " + name);
        }
    }

    // Method to print all patients in the department without parameters
    public void printPatients() {
        System.out.println("Listing all patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println("Patient: " + patient.getName() + ", Disease: " + patient.getDisease());
        }
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added to " + name + ": " + doctor.getName());
    }

    public void listDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName() + ", Specialty: " + doctor.getSpecialty());
        }
    }
}
