package Day4;

import java.util.Arrays;

public class Question_13 {
    
    static boolean solveMaze(int[][] maze, int i, int j, int n, int m, int[][] sol) {
    
        if (i < 0 || j < 0 || i >= n || j >= m || maze[i][j] == 1)
            return false;

        if (sol[i][j] == 1)
            return false;

        sol[i][j] = 1;

        if (i == n - 1 && j == m - 1)
            return true;

        // Move Down
        if (solveMaze(maze, i + 1, j, n, m, sol))
            return true;

        // Move Right
        if (solveMaze(maze, i, j + 1, n, m, sol))
            return true;

        // Move Up
        if (solveMaze(maze, i - 1, j, n, m, sol))
            return true;

        // Move Left
        if (solveMaze(maze, i, j - 1, n, m, sol))
            return true;

        // Backtrack (unmark)
        sol[i][j] = 0;

        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };

        int n = maze.length;
        int m = maze[0].length;

        int[][] sol = new int[n][m];

        if (solveMaze(maze, 0, 0, n, m, sol)) {
            for (int[] row : sol) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("No path found");
        }
    }
}
