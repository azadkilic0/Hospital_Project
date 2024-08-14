package hospital.main;

import hospital.entities.*;
import hospital.entities.services.HospitalService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating departments
        Department cardiology = new Department("Cardiology");
        Department neurology = new Department("Neurology");

        // Creating doctors
        Doctor drSmith = new Doctor("Dr. Smith", LocalDate.of(1980, 3, 15), "Cardiologist");
        Doctor drJones = new Doctor("Dr. Jones", LocalDate.of(1975, 8, 22), "Neurologist");

        // Adding doctors to departments
        cardiology.addDoctor(drSmith);
        neurology.addDoctor(drJones);

        // Creating patients
        Patient johnDoe = new Patient("John Doe", LocalDate.of(1990, 5, 24), "Hypertension", LocalDate.now());
        Patient janeDoe = new Patient("Jane Doe", LocalDate.of(1985, 11, 15), "Migraines", LocalDate.now().minusDays(1));

        // Hospital service instance
        HospitalService service = new HospitalService();

        // Admitting patients to different departments
        service.admitPatient(johnDoe, cardiology);
        service.admitPatient(janeDoe, neurology);

        // Listing initial patients and doctors in departments
        System.out.println("Initial setup in Cardiology:");
        cardiology.listDoctors();
        cardiology.printPatients();

        System.out.println("Initial setup in Neurology:");
        neurology.listDoctors();
        neurology.printPatients();

        // Discharging a patient and updating the list
        service.dischargePatient(johnDoe);
        System.out.println("Updated Patients in Cardiology after discharge:");
        cardiology.printPatients();
    }
}
