package Day2;

import java.util.*;

class MineSweeperGrid {
    static char[][] solve(char[][] grid, int m, int n) {
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 'E') {
                    int count = 0;

                    for(int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if(ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 'M') {
                            count++;
                        }
                    }

                    grid[i][j] = (char)(count + '0');
                }
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows (m):");
        int m = sc.nextInt();

        System.out.println("Enter columns (n):");
        int n = sc.nextInt();

        char[][] grid = new char[m][n];

        System.out.println("Enter grid (M for mine, E for empty):");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        char[][] result = solve(grid, m, n);

        System.out.println("Result Grid:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
I/P:
4 4

E M E E
E E M E
M E E E
E E M E

O/P:
1 M 2 1
2 3 M 1
M 3 2 2
1 2 M 1
*/