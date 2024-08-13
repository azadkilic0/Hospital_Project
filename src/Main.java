package hospital;

import services.*;
import entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Hospital instance (Singleton)
        Hospital hospital = Hospital.getInstance("City Hospital", "123 Main St");
        Hospital.printHospitalInfo();

        // Creating Department
        Department cardiology = new Department("Cardiology", "Dr. Smith");

        // Creating Doctor
        Doctor doctor = new Doctor("Dr. Jones", LocalDate.of(1980, 5, 10), "Cardiology", 150000);

        // Creating Patient
        Patient patient = new Patient("John Doe", LocalDate.of(1995, 3, 15), "P123", LocalDate.now());

        // Creating Nurse
        Nurse nurse = new Nurse("Nurse Mary", LocalDate.of(1990, 7, 20), "Cardiology", 5);

        // Creating Appointment
        Appointment appointment = new Appointment(doctor, patient, LocalDateTime.now());

        // Creating Prescription
        Prescription prescription = new Prescription("Atorvastatin", 20, LocalDate.now());

        // Creating Medical Record
        MedicalRecord record = new MedicalRecord(patient, List.of(prescription), LocalDate.now());

        // Using services.HospitalService
        HospitalService service = new HospitalService();
        service.admitPatient(patient, cardiology);
        service.admitPatient(patient, cardiology, nurse);
        service.dischargePatient(patient);
        service.dischargePatient(patient, "Recovered successfully.");

        // Print Details
        doctor.printDetails();
        patient.printDetails();
        nurse.printDetails();
        appointment.printDetails();
        cardiology.printDetails();
        record.printDetails();
    }
}
