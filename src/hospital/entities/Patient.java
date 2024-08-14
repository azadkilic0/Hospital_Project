package hospital.entities;

import java.time.LocalDate;

public class Patient extends Person {
    private String disease;
    private LocalDate admissionDate;
    private Department department;

    public Patient(String name, LocalDate birthDate, String disease, LocalDate admissionDate) {
        super(name, birthDate);
        this.disease = disease;
        this.admissionDate = admissionDate;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void printDetails() {
        System.out.println("Patient Name: " + getName() + ", Disease: " + getDisease() +
                ", Admission Date: " + getAdmissionDate() +
                ", Department: " + (department != null ? department.getName() : "No department"));
    }
}
