package Day5.Question11;

public class MathUtil {

    private MathUtil() {
        // prevent instantiation
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative not allowed");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}