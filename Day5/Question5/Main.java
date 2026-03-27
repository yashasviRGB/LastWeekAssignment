package Day5.Question5;

public class Main {
    public static void main(String[] args) {

        // Using master constructor
        Employee e1 = new Employee(1, "Alice", "IT", 60000);

        // Using constructor chaining (id, name)
        Employee e2 = new Employee(2, "Bob");

        // Using constructor chaining (id, name, department)
        Employee e3 = new Employee(3, "Charlie", "HR");

        e1.display();
        e2.display();
        e3.display();
    }
}
