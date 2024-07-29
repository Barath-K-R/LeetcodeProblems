package MathAndGeometry;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
       int left=0,right=matrix[0].length,top=0,bottom=matrix.length;
       while(left<right && top<bottom){
           for(int a=left;a<right;++a)
           res.add(matrix[top][a]);
           top++;
           for(int b=top;b<bottom;++b)
           res.add(matrix[b][right-1]);
           right--;

           if(!(left<right && top<bottom))
           break;
           for(int c=right-1;c>=left;c--)
           res.add(matrix[bottom-1][c]);
           bottom--;

           for(int d=bottom-1;d>=top;d--)
           res.add(matrix[d][left]);
           left++;

       }
       return res;

   }
	public static void main(String[] args) {
		int[][]matrix= {{1,2},{3,4}};
		List<Integer>res=spiralOrder(matrix);
		for(int n:res)
			System.out.println(n);
	}

}
