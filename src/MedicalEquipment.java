package hospital.entities;

import java.util.Objects;

public class MedicalEquipment {
    private String equipmentName;
    private String serialNumber;
    private Department department;

    public MedicalEquipment(String equipmentName, String serialNumber, Department department) {
        this.equipmentName = equipmentName;
        this.serialNumber = serialNumber;
        this.department = department;
    }

    @Override
    public String toString() {
        return "MedicalEquipment{equipmentName='" + equipmentName + "', serialNumber='" + serialNumber +
                "', department=" + (department != null ? department.getName() : "No department") + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalEquipment that = (MedicalEquipment) o;
        return Objects.equals(equipmentName, that.equipmentName) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentName, serialNumber, department);
    }
    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
