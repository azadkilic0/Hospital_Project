package hospital.entities;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {
    protected String name;
    protected LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void work();
    public abstract String getRole();

    @Override
    public String toString() {
        return "Person{name='" + name + "', birthDate=" + birthDate + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }


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
}
