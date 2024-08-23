package hospital.entities;

import java.util.Arrays;

public class Hospital {
    private String name;
    private String location;
    private Department[] departments = new Department[10];
    private Doctor[] doctors = new Doctor[50];
    private Nurse[] nurses = new Nurse[50];
    private Patient[] patients = new Patient[200];
    private Admin[] admins = new Admin[10];
    private MedicalRecord[] medicalRecords = new MedicalRecord[200];
    private MedicalEquipment[] equipment = new MedicalEquipment[100];
    private Appointment[] appointments = new Appointment[100];
    private Prescription[] prescriptions = new Prescription[200];

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addDoctor(Doctor doctor) {
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] == null) {
                doctors[i] = doctor;
                break;
            }
        }
    }

    public void addNurse(Nurse nurse) {
        for (int i = 0; i < nurses.length; i++) {
            if (nurses[i] == null) {
                nurses[i] = nurse;
                break;
            }
        }
    }

    public void addPatient(Patient patient) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                break;
            }
        }
    }

    public void addAdmin(Admin admin) {
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] == null) {
                admins[i] = admin;
                break;
            }
        }
    }

    public void addDepartment(Department department) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = department;
                break;
            }
        }
    }

    public void addMedicalRecord(MedicalRecord record) {
        for (int i = 0; i < medicalRecords.length; i++) {
            if (medicalRecords[i] == null) {
                medicalRecords[i] = record;
                break;
            }
        }
    }

    public void addEquipment(MedicalEquipment eq) {
        for (int i = 0; i < equipment.length; i++) {
            if (equipment[i] == null) {
                equipment[i] = eq;
                break;
            }
        }
    }

    public void addAppointment(Appointment appointment) {
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                appointments[i] = appointment;
                break;
            }
        }
    }

    public void addPrescription(Prescription prescription) {
        for (int i = 0; i < prescriptions.length; i++) {
            if (prescriptions[i] == null) {
                prescriptions[i] = prescription;
                break;
            }
        }
    }


    public Department[] getDepartments() {
        return departments;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public Admin[] getAdmins() {
        return admins;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public MedicalEquipment[] getEquipment() {
        return equipment;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public Prescription[] getPrescriptions() {
        return prescriptions;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", doctors=" + Arrays.toString(doctors) +
                ", nurses=" + Arrays.toString(nurses) +
                ", patients=" + Arrays.toString(patients) +
                ", admins=" + Arrays.toString(admins) +
                ", medicalRecords=" + Arrays.toString(medicalRecords) +
                ", equipment=" + Arrays.toString(equipment) +
                ", appointments=" + Arrays.toString(appointments) +
                ", prescriptions=" + Arrays.toString(prescriptions) +
                '}';
    }
}
