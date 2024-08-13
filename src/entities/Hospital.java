package entities;
public class Hospital {
    private static Hospital instance;
    private String name;
    private String location;

    private Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public static Hospital getInstance(String name, String location) {
        if (instance == null) {
            instance = new Hospital(name, location);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void printHospitalInfo() {
        System.out.println("Hospital: " + instance.getName() + ", Location: " + instance.getLocation());
    }
}
