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
    String s1="123";
    String s2="567";
    StringBuilder res=new StringBuilder();
    for(int i=s2.length()-1;i>=0;i--){
        for(int j=s1.length()-1;j>=0;--j){
            StringBuilder carry=new StringBuilder(),tempres=new StringBuilder();
            int multiply=Integer.parseInt(s2.substring(i, i+1))*Integer.parseInt(s1.substring(j, j+1));
            carry.append(multiply);
            System.out.println("value"+((s2.length()-1)-i)+((s1.length()-1)-j));
            int start=(res.length()-1)-((s2.length()-1)-i)+((s1.length()-1)-j);

            System.out.println("multiply="+multiply);
            System.out.println("start="+start);
            for(int k=start;k>=0;k--){
                int sum = res.length() > 0 
    ? Integer.parseInt(res.substring(start, start + 1)) + Integer.parseInt(carry.toString())
    : Integer.parseInt(carry.toString());
                System.out.println("sum="+sum);
                tempres.setLength(0);
                tempres.append(sum);
                if(tempres.length()>1){
                    carry.setLength(0);
                    carry.append(tempres.substring(0,1));
                    tempres.delete(0, 1);
                }
                else
                carry.setLength(0);

                if(!res.isEmpty())
                res.setCharAt(start, tempres.charAt(0));
                else
                res.append(tempres);
            }
            if(!carry.isEmpty())
            res.insert(0,carry);
            System.out.println("res="+res);
        }
    }
    System.out.println(res);
}
>>>>>>> 1c68358beb33f1299c63b3c5b55dde9b47b5121a
}