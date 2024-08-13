package entities;

import java.time.LocalDate;

public class Nurse extends Person {
    private String department;
    private int yearsOfExperience;

    public Nurse(String name, LocalDate birthDate, String department, int yearsOfExperience) {
        super(name, birthDate);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printDetails() {
        System.out.println("Nurse: " + getName() + ", Department: " + department);
    }
}

