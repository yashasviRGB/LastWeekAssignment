package Day5.Question1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.accelerate(50);

        Car car2 = new Car();
        car2.accelerate(30);

        System.out.println("Car1 Speed: " + car1.currentSpeed);
        System.out.println("Car2 Speed: " + car2.currentSpeed);
    }
}