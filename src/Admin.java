package hospital.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Admin extends Person {
    private String role;
    private int yearsOfService;

    public Admin(String name, LocalDate birthDate, String role, int yearsOfService) {
        super(name, birthDate);
        this.role = role;
        this.yearsOfService = yearsOfService;
    }

    @Override
    public void work() {
        System.out.println("Admin " + name + " is managing hospital operations.");
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    @Override
    public String toString() {
        return "Admin{name='" + name + "', birthDate=" + birthDate +
                ", role='" + role + "', yearsOfService=" + yearsOfService + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return yearsOfService == admin.yearsOfService &&
                Objects.equals(name, admin.name) &&
                Objects.equals(birthDate, admin.birthDate) &&
                Objects.equals(role, admin.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, role, yearsOfService);
    }


    public String getRoleName() {
        return role;
    }

    public void setRoleName(String role) {
        this.role = role;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}
