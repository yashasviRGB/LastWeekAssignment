package Day4;

class Question_3 {

    static void modifyPrimitive(int x) {
        x = 99;
    }

    static void modifyArray(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int a = 10;
        int[] b = {10, 20};

        modifyPrimitive(a);
        modifyArray(b);

        System.out.println("a = " + a);        // 10
        System.out.println("b[0] = " + b[0]);  // 99
    }
}
