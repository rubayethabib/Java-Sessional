class Student {
    private String name;
    private String id;
    private double cgpa;
    // Default Constructor
    public Student() {
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rubayet Ahasan Habib");
         s.setId("E251040");
        s.setCgpa(4.00)
        System.out.println("Student Information:");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("CGPA: " + s.getCgpa());
    }
}

