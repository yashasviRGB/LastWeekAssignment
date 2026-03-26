package Day4;

class Question_2 {

    static double calculateAverage(double... numbers) {
        if (numbers.length == 0) return 0;

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20));           // 15.0
        System.out.println(calculateAverage(1, 2, 3, 4, 5));    // 3.0
        System.out.println(calculateAverage());                 // 0.0
    }
}
