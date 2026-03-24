package Day2;

import java.util.*;

class MatrixMultiplication {
    static int[][] multiply(int[][] A, int[][] B, int m, int n, int p) {
        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of Matrix A (m n):");
        int m = sc.nextInt(), n = sc.nextInt();

        int[][] A = new int[m][n];

        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter rows and columns of Matrix B (n p):");
        int n2 = sc.nextInt(), p = sc.nextInt();

        int[][] B = new int[n2][p];

        System.out.println("Enter elements of Matrix B:");
        for(int i = 0; i < n2; i++)
            for(int j = 0; j < p; j++)
                B[i][j] = sc.nextInt();

        if (n != n2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] C = multiply(A, B, m, n, p);

        System.out.println("Resultant Matrix:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}