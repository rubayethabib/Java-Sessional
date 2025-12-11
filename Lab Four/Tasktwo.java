class IDCard {
    String name;
    String id;
    String department;
    String institution;

    // Constructor to initialize data
    IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    // Method to display ID information
    void showID() {
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Department  : " + department);
        System.out.println("Institution : " + institution);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating ID card objects
        IDCard student1 = new IDCard("Rubayet", "251040", "CCE", "IIUC");
        IDCard student2 = new IDCard("Rony", "251070", "CCE", "IIUC");

        // Display information
        System.out.println("== Student 1 ID Card ==");
        student1.showID();

        System.out.println("\n== Student 2 ID Card ==");
        student2.showID();
    }
}

