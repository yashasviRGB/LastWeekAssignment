package Day2;

import java.util.*;

class ArrayRotation {
    static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        System.out.println("Enter rotation steps (k):");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        rotate(arr, k);

        System.out.println("Rotated Array:");
        for(int x : arr) System.out.print(x + " ");
    }
}