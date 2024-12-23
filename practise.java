<<<<<<< HEAD
import java.io.File;
import java.util.*;

=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.lang.reflect.AccessibleObject;
>>>>>>> 1c68358beb33f1299c63b3c5b55dde9b47b5121a
/**
 * practise
 */
public class practise {
<<<<<<< HEAD
    public static int numIsIslands(String[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j].equals("1")) {
                    bfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void bfs(String[][] grid, int row, int col) {
        int[][] direction = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { row, col });
        grid[row][col] = "0";
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currRow = curr[0], currColumn = curr[1];

            for (int[] d : direction) {
                int nr = currRow + d[0], nc = currColumn + d[1];
                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc].equals("1")) {
                    queue.offer(new int[] { nr, nc });
                    grid[nr][nc] = "0";
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][] grid = {
                { "1", "1", "0", "0", "1" },
                { "1", "1", "0", "0", "1" },
                { "0", "0", "1", "0", "0" },
                { "0", "0", "0", "1", "1" }
        };
        System.out.println(numIsIslands(grid));
    }
=======

public static void main(String[] args) {
     int[]heights={2,1,5,6,2,3};
     
}
>>>>>>> 1c68358beb33f1299c63b3c5b55dde9b47b5121a
}