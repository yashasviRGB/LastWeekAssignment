package Day2;

import java.util.*;

class SlidingWindowMaxSum {
    static int maxSum(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) sum += arr[i];

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        System.out.println("Enter window size (k):");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Maximum Sum: " + maxSum(arr, k));
        sc.close();
    }
}