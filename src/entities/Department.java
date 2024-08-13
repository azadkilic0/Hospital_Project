package entities;
public class Department {
    private String departmentName;
    private String headOfDepartment;

    public Department(String departmentName, String headOfDepartment) {
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public void printDetails() {
        System.out.println("Department: " + departmentName + ", Head: " + headOfDepartment);
    }
}
