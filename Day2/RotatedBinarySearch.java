package Day2;
import java.util.*;

class RotatedBinarySearch {
    static int search(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == key) return mid;

            if (arr[mid] >= arr[lo]) {
                if (key >= arr[lo] && key < arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else {
                if (key > arr[mid] && key <= arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        System.out.println("Enter target key:");
        int key = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Index: " + search(arr, key));
    }
}