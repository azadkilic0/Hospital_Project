package services;

import entities.*;
public class    HospitalService {

    public void admitPatient(Patient patient, Department department) {
        System.out.println("Admitting patient " + patient.getName() + " to " + department.getDepartmentName());
    }

    // Overloaded method to admit a patient with specific nurse care
    public void admitPatient(Patient patient, Department department, Nurse nurse) {
        System.out.println("Admitting patient " + patient.getName() + " to " + department.getDepartmentName() + " under care of nurse " + nurse.getName());
    }

    public void dischargePatient(Patient patient) {
        System.out.println("Discharging patient " + patient.getName());
    }

    // Overloaded method to discharge with summary
    public void dischargePatient(Patient patient, String summary) {
        System.out.println("Discharging patient " + patient.getName() + ". Summary: " + summary);
    }
}
