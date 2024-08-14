package hospital.entities;

import java.time.LocalDate;
import java.util.List;

public class MedicalRecord {
    private Patient patient;
    private List<Prescription> prescriptions;
    private LocalDate recordDate;

    public MedicalRecord(Patient patient, List<Prescription> prescriptions, LocalDate recordDate) {
        this.patient = patient;
        this.prescriptions = prescriptions;
        this.recordDate = recordDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public void printDetails() {
        System.out.println("Medical Record for " + patient.getName() + " on " + recordDate);
    }
}

