package Day4;

class Question_12 {

    static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1
        solve(n - 1, source, destination, auxiliary);

        // Step 2
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'B', 'C');
    }
}
