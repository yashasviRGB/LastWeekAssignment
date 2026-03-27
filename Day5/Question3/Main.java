package Day5.Question3;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1.length + "," + r1.width);
        System.out.println(r2.length + "," + r2.width);
        System.out.println(r3.length + "," + r3.width);
    }
}