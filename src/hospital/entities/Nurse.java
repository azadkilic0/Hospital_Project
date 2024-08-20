package hospital.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Nurse extends Person {
    private String department;
    private int yearsOfExperience;

    public Nurse(String name, LocalDate birthDate, String department, int yearsOfExperience) {
        super(name, birthDate);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println("Nurse " + name + " is caring for patients.");
    }

    @Override
    public String getRole() {
        return "Nurse";
    }

    @Override
    public String toString() {
        return "Nurse{name='" + name + "', birthDate=" + birthDate +
                ", department='" + department + "', yearsOfExperience=" + yearsOfExperience + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return yearsOfExperience == nurse.yearsOfExperience &&
                Objects.equals(name, nurse.name) &&
                Objects.equals(birthDate, nurse.birthDate) &&
                Objects.equals(department, nurse.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, department, yearsOfExperience);
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
}
