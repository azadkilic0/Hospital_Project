package hospital.entities;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthDate;

    // Constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Public getter for name to ensure accessibility
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Setter for birthDate
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // Abstract method to be implemented by subclasses for specific print details
    public abstract void printDetails();
}
