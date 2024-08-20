
import hospital.entities.*;
import hospital.entities.services.HospitalService;
import java.time.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {


                // Initializing services
                HospitalService hospitalService = new HospitalService(100);
                Scanner scanner = new Scanner(System.in);

                // Adding departments
                Department generalMedicine = new Department("General Medicine");
                Department surgery = new Department("Surgery");
                hospitalService.addDepartment(generalMedicine);
                hospitalService.addDepartment(surgery);

                // Adding some doctors
                Doctor doctor1 = new Doctor("Dr. John Smith", LocalDate.of(1980, 5, 20), "Cardiology");
                Doctor doctor2 = new Doctor("Dr. Emily Johnson", LocalDate.of(1975, 3, 15), "Neurology");

                hospitalService.displayPersonDetails(doctor1);
                hospitalService.displayPersonDetails(doctor2);

                // Adding patients
                Patient patient1 = new Patient("Alice Brown", LocalDate.of(1990, 8, 25), "Heart Disease", LocalDate.of(2024, 8, 10), generalMedicine);
                Patient patient2 = new Patient("Bob White", LocalDate.of(1985, 12, 30), "Fracture", LocalDate.of(2024, 8, 12), surgery);

                hospitalService.addPatient(patient1);
                hospitalService.addPatient(patient2);

                hospitalService.displayPersonDetails(patient1);
                hospitalService.displayPersonDetails(patient2);

                // Processing persons
                hospitalService.processPerson(doctor1);
                hospitalService.processPerson(patient1);

                // Interactive part using Scanner
                System.out.println("Enter new doctor's name:");
                String newDoctorName = scanner.nextLine();
                System.out.println("Enter new doctor's birthdate (YYYY-MM-DD):");
                LocalDate newDoctorBirthDate = LocalDate.parse(scanner.nextLine());
                System.out.println("Enter new doctor's specialty:");
                String newSpecialty = scanner.nextLine();
                Doctor newDoctor = new Doctor(newDoctorName, newDoctorBirthDate, newSpecialty);

                hospitalService.displayPersonDetails(newDoctor);

                System.out.println("Enter new patient's name:");
                String newPatientName = scanner.nextLine();
                System.out.println("Enter new patient's birthdate (YYYY-MM-DD):");
                LocalDate newPatientBirthDate = LocalDate.parse(scanner.nextLine());
                System.out.println("Enter new patient's disease:");
                String newDisease = scanner.nextLine();
                System.out.println("Enter admission date (YYYY-MM-DD):");
                LocalDate newAdmissionDate = LocalDate.parse(scanner.nextLine());

                Patient newPatient = new Patient(newPatientName, newPatientBirthDate, newDisease, newAdmissionDate, generalMedicine);

                hospitalService.addPatient(newPatient);
                hospitalService.displayPersonDetails(newPatient);

                System.out.println("Processing new doctor...");
                hospitalService.processPerson(newDoctor);

                System.out.println("Processing new patient...");
                hospitalService.processPerson(newPatient);


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
