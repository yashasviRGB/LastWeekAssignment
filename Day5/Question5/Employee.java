package Day5.Question5;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Master constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor with id, name
    public Employee(int id, String name) {
        this(id, name, "Unassigned", 0.0);
    }

    // Constructor with id, name, department
    public Employee(int id, String name, String department) {
        this(id, name, department, 0.0);
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}