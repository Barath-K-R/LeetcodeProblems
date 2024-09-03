package graphs;
import java.util.*;;
public class FloodFill {
    
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[]pos=new int[2];
        int oldcolor=image[sr][sc];
        
        //if new color is equal to old color
        if(oldcolor==color)
        return image;

        int[][]direction={{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        pos[0]=sr;
        pos[1]=sc;

        Queue<int[]>q=new LinkedList<>();
        q.add(pos);
        image[sr][sc]=color;
        
        while(!q.isEmpty()){
            pos=q.poll();
            for(int[]dir:direction){
                int newRow=pos[0]+dir[0],newColumn=pos[1]+dir[1];
                if(newRow>=0 && newRow<image.length && newColumn>=0 && newColumn<image[0].length && image[newRow][newColumn]==oldcolor){
                    image[newRow][newColumn]=color;
                    q.offer(new int[]{newRow,newColumn});
                }
            }

        }
        return image;
    }
    public static void main(String[] args) {
        int[][]image={{0,0,0},{0,0,0}};
        floodFill(image, 0, 0, 0);
        for(int[]nums:image){
            for(int n:nums){
            System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
