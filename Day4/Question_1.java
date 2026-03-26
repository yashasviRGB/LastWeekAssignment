package Day4;

class Geometry{

    public double calculateArea(double radius){
        double result = radius * Math.PI * radius;
        return result;
    }
    public double calculateArea(int length, int width){
        double result = length * width;
        return result;
    }
    public double calculateArea(double base, double height, boolean isTriangle){
        double result = 0.5 * base * height;
        return result;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Geometry obj = new Geometry();
        System.out.println("Area of circle: "+obj.calculateArea(10));
        System.out.println("Area of rectangle: "+obj.calculateArea(10,20));
        System.out.println("Area of triangle: "+obj.calculateArea(6,8,true));
    }
}
