package hospital.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Doctor extends Person {
    private String specialty;

    public Doctor(String name, LocalDate birthDate, String specialty) {
        super(name, birthDate);
        this.specialty = specialty;
    }

    @Override
    public void work() {
        System.out.println("Doctor " + name + " is treating patients.");
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public String toString() {
        return "Doctor{name='" + name + "', birthDate=" + birthDate + ", specialty='" + specialty + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) &&
                Objects.equals(birthDate, doctor.birthDate) &&
                Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, specialty);
    }

    // Getters and Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
