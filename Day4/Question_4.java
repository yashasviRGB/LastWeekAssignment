package Day4;

class Question_4 {

    static void countDown(int n) {
        if (n == 0) return;
        System.out.println(n);
        countDown(n - 1);
    }

    static void countUp(int n) {
        if (n == 0) return;
        countUp(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        countDown(5);
        System.out.println("----");
        countUp(5);
    }
}
