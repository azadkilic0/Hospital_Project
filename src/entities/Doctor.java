package entities;
import java.time.LocalDate;

public class Doctor extends Person {
    private String specialty;
    private double salary;

    public Doctor(String name, LocalDate birthDate, String specialty, double salary) {
        super(name, birthDate);
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void printDetails() {
        System.out.println("Doctor: " + getName() + ", Specialty: " + specialty);
    }
}
