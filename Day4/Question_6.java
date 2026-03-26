package Day4;

class Question_6 {

    static int sumOfDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(253)); // 10
    }
}