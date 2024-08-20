package hospital.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Patient extends Person {
    private String disease;
    private LocalDate admissionDate;
    private Department department;

    public Patient(String name, LocalDate birthDate, String disease, LocalDate admissionDate, Department department) {
        super(name, birthDate);
        this.disease = disease;
        this.admissionDate = admissionDate;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Patient " + name + " is resting to recover.");
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', birthDate=" + birthDate +
                ", disease='" + disease + "', admissionDate=" + admissionDate + ", department=" + department.getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) &&
                Objects.equals(birthDate, patient.birthDate) &&
                Objects.equals(disease, patient.disease) &&
                Objects.equals(admissionDate, patient.admissionDate) &&
                Objects.equals(department, patient.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, disease, admissionDate, department);
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
}
