package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(String[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j].equals("1")) {
                    maxArea=Math.max(bfs(grid, i, j),maxArea);
                    
                }
            }
        }
        return maxArea;
    }

    public static int bfs(String[][] grid, int row, int col) {
        int[][] direction = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        int count=0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { row, col });
        count++;
        grid[row][col] = "0";
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currRow = curr[0], currColumn = curr[1];

            for (int[] d : direction) {
                int nr = currRow + d[0], nc = currColumn + d[1];
                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc].equals("1")) {
                    queue.offer(new int[] { nr, nc });
                    grid[nr][nc] = "0";
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] grid = {
            {"0", "1", "1", "0", "1"},
            {"1", "0", "1", "0", "1"},
            {"0", "1", "1", "0", "1"},
            {"0", "1", "0", "0", "1"}
        };
        System.out.println(maxAreaOfIsland(grid));
    }
}
