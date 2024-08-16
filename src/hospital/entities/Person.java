package hospital.entities;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthDate;


    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Public getter for name to ensure accessibility
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public abstract void printDetails();
}
