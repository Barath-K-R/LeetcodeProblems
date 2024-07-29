package MathAndGeometry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < grid.length; i++) {
            Integer[] tmp = new Integer[grid.length];
            for(int j = 0; j < grid.length; j++)
                tmp[j] = 0;
            res.add(Arrays.asList(tmp));
        }
        for(int i=0;i<grid.length;++i){
            res.add(new ArrayList<>());
            for(int j=0;j<grid[0].length;++j){
                int element=grid[i][j];
                int value=postoval(i, j, grid.length);
                value=value+k;
                int[]position=valtopos(value, k,grid.length);
                res.get(position[0]).set(position[1],element);
            }
        }
        return res;
    }
    public static int postoval(int row,int column,int n){
        System.out.println("value="+(row*n+column));
        return row*n+column;
    }

    public static int[] valtopos(int val,int k,int n){
        System.out.println("updated value="+val);
        int[]position=new int[2];
        position[0]=(val/n);
        position[1]=val%n;
        System.out.println(position[0]+" "+position[1]);
        return position;
    }
    public static void main(String[] args) {
        int[][]grid={{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> res=shiftGrid(grid, 4);
        for(List<Integer>l:res){
            for(int num:l)
            System.out.print(num);
            System.out.println();
        }
    }
}
