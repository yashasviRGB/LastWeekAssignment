package Day2;

import java.util.*;

class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int l = i + 1, r = arr.length - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (l < r && arr[l] == arr[l + 1]) l++;
                    while (l < r && arr[r] == arr[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) l++;
                else r--;
            }
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

        List<List<Integer>> ans = threeSum(arr);

        System.out.println("Triplets:");
        for (List<Integer> list : ans) {
            for (int x : list) System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }
}