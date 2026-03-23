import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double p = sc.nextDouble();

        if (p < 0 || p > 100) {
            System.out.println("Invalid Input");
        } else if (p >= 90) {
            System.out.println("Grade A");
        } else if (p >= 80) {
            System.out.println("Grade B");
        } else if (p >= 70) {
            System.out.println("Grade C");
        } else if (p >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}