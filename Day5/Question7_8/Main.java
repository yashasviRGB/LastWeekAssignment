package Day5.Question7_8;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(101, "Yash", 3.5);

        s.setGpa(3.8);
        System.out.println("Updated GPA: " + s.getGpa());

        s.setGpa(5.0);
        System.out.println("After invalid update GPA: " + s.getGpa());

        s.setName("Yashasvi");
        System.out.println("Name: " + s.getName());
    }
}
