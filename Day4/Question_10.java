package Day4;

import java.util.Scanner;

public class Question_10 {

    static int binarySearch(int[] arr, int low, int high, int key){

        if(low > high) return -1;

        int mid = (low+high)/2;
        if(arr[mid] == key) return mid;
        else if(arr[mid] > key) return binarySearch(arr, low, mid - 1, key);
        else return binarySearch(arr, mid + 1, high, key);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10,15,20,30,47};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, key);

        if(result == -1)
            System.out.println(" Element not found");
        else 
            System.out.println("Element found at index: " + result);
        sc.close();
    }
}
