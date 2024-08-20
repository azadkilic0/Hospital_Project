import hospital.entities.*;
import hospital.entities.Admin;
import hospital.entities.MedicalEquipment;
import hospital.entities.services.HospitalService;
import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalService hospitalService = new HospitalService(100);

        // Admin Creation
        System.out.println("Enter new admin's name:");
        String adminName = scanner.nextLine();
        System.out.println("Enter admin's birthdate (YYYY-MM-DD):");
        LocalDate adminBirthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter admin's role:");
        String adminRole = scanner.nextLine();
        System.out.println("Enter admin's years of service:");
        int adminYearsOfService = Integer.parseInt(scanner.nextLine());
        Admin newAdmin = new Admin(adminName, adminBirthDate, adminRole, adminYearsOfService);

        hospitalService.processPerson(newAdmin);

        // Doctor Creation
        System.out.println("Enter new doctor's name:");
        String newDoctorName = scanner.nextLine();
        System.out.println("Enter new doctor's birthdate (YYYY-MM-DD):");
        LocalDate newDoctorBirthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter new doctor's specialty:");
        String newSpecialty = scanner.nextLine();
        Doctor newDoctor = new Doctor(newDoctorName, newDoctorBirthDate, newSpecialty);

        hospitalService.processPerson(newDoctor);

        // Patient Creation
        System.out.println("Enter new patient's name:");
        String newPatientName = scanner.nextLine();
        System.out.println("Enter new patient's birthdate (YYYY-MM-DD):");
        LocalDate newPatientBirthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter new patient's disease:");
        String newDisease = scanner.nextLine();
        System.out.println("Enter admission date (YYYY-MM-DD):");
        LocalDate newAdmissionDate = LocalDate.parse(scanner.nextLine());

        Department department = new Department("General Medicine");
        Patient newPatient = new Patient(newPatientName, newPatientBirthDate, newDisease, newAdmissionDate, department);

        hospitalService.addPatient(newPatient);
        hospitalService.processPerson(newPatient);

        // Nurse Creation
        System.out.println("Enter new nurse's name:");
        String newNurseName = scanner.nextLine();
        System.out.println("Enter new nurse's birthdate (YYYY-MM-DD):");
        LocalDate newNurseBirthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter new nurse's department:");
        String newNurseDepartment = scanner.nextLine();
        System.out.println("Enter nurse's years of experience:");
        int newNurseExperience = Integer.parseInt(scanner.nextLine());
        Nurse newNurse = new Nurse(newNurseName, newNurseBirthDate, newNurseDepartment, newNurseExperience);

        hospitalService.processPerson(newNurse);

        // Medical Equipment Creation
        System.out.println("Enter new medical equipment name:");
        String equipmentName = scanner.nextLine();
        System.out.println("Enter equipment serial number:");
        String serialNumber = scanner.nextLine();
        System.out.println("Enter department name for equipment:");
        String equipmentDepartmentName = scanner.nextLine();
        Department equipmentDepartment = new Department(equipmentDepartmentName);
        MedicalEquipment newEquipment = new MedicalEquipment(equipmentName, serialNumber, equipmentDepartment);

        System.out.println(newEquipment.toString());

        // Closing scanner
        scanner.close();
    }



    public static void mergeSort(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the elements of the array as command-line arguments.");
            return;
        }

        int[] array = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: All input values must be integers.");
            return;
        }

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
