package Day5.Question2;

public class Main {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.width = 10;

        Box b2 = b1;
        b2.width = 50;

        System.out.println("b1.width: " + b1.width); // 50
    }
}