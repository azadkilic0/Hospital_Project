package hospital.entities.services;

import hospital.entities.Patient;
import hospital.entities.Person;
import hospital.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class HospitalService {
    private List<Patient> patients = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private int maxBeds = 100;

    public HospitalService(int maxBeds) {
        this.maxBeds = maxBeds;
    }

    public void addPatient(Patient patient) {
        if (patients.size() < maxBeds) {
            patients.add(patient);
            System.out.println("Patient added: " + patient.getName());
        } else {
            System.out.println("Cannot add patient. Hospital is full.");
        }
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
        System.out.println("Patient removed: " + patient.getName());
    }

    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Department added: " + department.getName());
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public int getMaxBeds() {
        return maxBeds;
    }

    public void setMaxBeds(int maxBeds) {
        this.maxBeds = maxBeds;
    }


    public void displayPersonDetails(Person person) {
        System.out.println(person.toString());
    }

    // Method that accepts only Person and its subclasses
    public void processPerson(Person person) {
        if (person instanceof Patient) {
            System.out.println("Processing patient: " + person.getName());
        } else {
            System.out.println("Processing person: " + person.getName());
        }
    }
}
