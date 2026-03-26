package Day2;
import java.util.*;

class RotateMatrix90 {
    static void rotate(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l++] = mat[i][r];
                mat[i][r--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of square matrix (n):");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements row-wise:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        rotate(mat, n);

        System.out.println("Rotated Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}