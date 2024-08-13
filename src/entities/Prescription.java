package entities;

import java.time.LocalDate;

public class Prescription {
    private String medicineName;
    private int dosage;
    private LocalDate prescriptionDate;

    public Prescription(String medicineName, int dosage, LocalDate prescriptionDate) {
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.prescriptionDate = prescriptionDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public LocalDate getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(LocalDate prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public void printDetails() {
        System.out.println("Prescription: " + medicineName + ", Dosage: " + dosage + "mg, Date: " + prescriptionDate);
    }
}

