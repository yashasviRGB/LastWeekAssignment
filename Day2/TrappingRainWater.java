package Day2;

import java.util.*;

class TrappingRainWater {
    static int maxWater(int[] arr) {
        int left = 1, right = arr.length - 2;
        int lMax = arr[0], rMax = arr[arr.length - 1];
        int res = 0;

        while (left <= right) {
            if (rMax <= lMax) {
                res += Math.max(0, rMax - arr[right]);
                rMax = Math.max(rMax, arr[right]);
                right--;
            } else {
                res += Math.max(0, lMax - arr[left]);
                lMax = Math.max(lMax, arr[left]);
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n):");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elevation heights:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Total Trapped Water: " + maxWater(arr));
    }
}