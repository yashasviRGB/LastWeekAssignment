package Day2;

import java.util.*;

class KadaneAlgorithm {
    static int maxSubarraySum(int[] arr) {
        int res = arr[0], maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));

        sc.close();
    }
}