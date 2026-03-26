package Day4;

class Question_5 {

    static void infiniteRecursion(int count) {
        System.out.println(count);
        infiniteRecursion(count + 1);
    }

    public static void main(String[] args) {
        infiniteRecursion(1);
    }
}
