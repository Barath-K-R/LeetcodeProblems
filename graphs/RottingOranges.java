package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static int orangesRotting(int[][] grid) {
        int fresh = 0, minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
        
        //Add all rotten oranges positions to the queue and count fresh oranges
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 2)
                    q.offer(new int[] {i, j});
                else if (grid[i][j] == 1)
                    fresh++;
            }
        }
        
        if (fresh == 0) return 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean changed = false; 
            
            for (int i = 0; i < size; i++) {
                int[] currentPosition = q.poll();
                
                for (int[] dir : directions) {
                    int nr = currentPosition[0] + dir[0];
                    int nc = currentPosition[1] + dir[1];
                    
                    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1) {
                        q.offer(new int[] {nr, nc});
                        grid[nr][nc] = 2;
                        fresh--;
                        changed = true;
                    }
                }
            }
            
            if (changed) minutes++;
        }
        return (fresh == 0) ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0}};
        System.out.println(orangesRotting(grid)); // Should output 0
    }
}
