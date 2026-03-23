import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "secret123";
        String input;

        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();
        } while (!input.equals(correctPassword));

        System.out.println("Access Granted");
    }
}