package hospital.entities;

import java.time.LocalDate;

public class Doctor extends Person {
    private String specialty;

    public Doctor(String name, LocalDate birthDate, String specialty) {
        super(name, birthDate);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("Doctor Name: " + getName() + ", Specialty: " + getSpecialty());
    }
}
