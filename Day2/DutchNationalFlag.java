package Day2;

import java.util.*;

class DutchNationalFlag {
    static void sort012(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[lo];
                arr[lo++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (only 0, 1, 2):");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        sort012(arr);

        System.out.println("Sorted Array:");
        for(int x : arr) System.out.print(x + " ");
    }
}