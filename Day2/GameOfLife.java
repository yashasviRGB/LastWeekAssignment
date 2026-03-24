package Day2;

import java.util.*;

class GameOfLife {
    static int[][] nextState(int[][] grid, int m, int n) {
        int[][] result = new int[m][n];

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                int liveNeighbors = 0;

                for(int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];

                    if(ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                        liveNeighbors++;
                    }
                }

                if(grid[i][j] == 1) {
                    if(liveNeighbors < 2 || liveNeighbors > 3) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else {
                    if(liveNeighbors == 3) {
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows (m):");
        int m = sc.nextInt();

        System.out.println("Enter columns (n):");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter grid (0 = dead, 1 = alive):");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] next = nextState(grid, m, n);

        System.out.println("Next Generation:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(next[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
3 3
0 1 0
0 1 0
0 1 0

*/
