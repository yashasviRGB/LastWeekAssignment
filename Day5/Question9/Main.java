package Day5.Question9;

public class Main {
    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); // invalid
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
