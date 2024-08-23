package hospital.entities;

import java.util.Arrays;
import java.util.Objects;

public class MedicalRecord {
    private Patient patient;
    private String[] diagnoses = new String[50];
    private String[] treatments = new String[50];
    private Doctor doctor;

    public MedicalRecord(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void addDiagnosis(String diagnosis) {
        for (int i = 0; i < diagnoses.length; i++) {
            if (diagnoses[i] == null) {
                diagnoses[i] = diagnosis;
                break;
            }
        }
    }

    public void addTreatment(String treatment) {
        for (int i = 0; i < treatments.length; i++) {
            if (treatments[i] == null) {
                treatments[i] = treatment;
                break;
            }
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "patient=" + patient.getName() +
                ", diagnoses=" + Arrays.toString(diagnoses) +
                ", treatments=" + Arrays.toString(treatments) +
                ", doctor=" + doctor.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecord that = (MedicalRecord) o;
        return Objects.equals(patient, that.patient) &&
                Objects.equals(doctor, that.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, doctor);
    }
}
