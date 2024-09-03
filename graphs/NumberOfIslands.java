package graphs;
import java.util.*;

public class NumberOfIslands {
    public static void dfs(int r, int c, char[][] grid, boolean[][] visited) {
        
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || visited[r][c] || grid[r][c] == '0')
            return;
        visited[r][c] = true;
        
        dfs(r + 1, c, grid, visited); // Down
        dfs(r, c + 1, grid, visited); // Right
        dfs(r - 1, c, grid, visited); // Up
        dfs(r, c - 1, grid, visited); // Left
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length;   
        int m = grid[0].length; 
        int count = 0;         
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) { 
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, grid, visited);
                    count++; 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid)); 
    }
}
