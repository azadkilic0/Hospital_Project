package hospital.entities.services;

import hospital.entities.Patient;
import hospital.entities.Department;
import java.util.ArrayList;
import java.util.List;

public class HospitalService {
    private List<Patient> admittedPatients = new ArrayList<>();
    private static final int MAX_BEDS = 100;

    public void admitPatient(Patient patient, Department department) {
        if (admittedPatients.size() < MAX_BEDS) {
            admittedPatients.add(patient);
            patient.setDepartment(department);
            System.out.println("Admitting patient " + patient.getName() + " to " + department.getName());
        } else {
            System.out.println("No available beds to admit patient " + patient.getName());
        }
    }

    public void dischargePatient(Patient patient) {
        if (admittedPatients.contains(patient)) {
            admittedPatients.remove(patient);
            System.out.println("Discharging patient " + patient.getName());
        } else {
            System.out.println("Patient " + patient.getName() + " is not admitted.");
        }
    }
}
