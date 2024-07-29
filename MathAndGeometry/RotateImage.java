package MathAndGeometry;

public class RotateImage {
	public static void rotate(int[][] matrix) {
        int l = 0,r = matrix.length - 1,t=0,b=matrix.length-1;
      while ( l<r && t<b )
      {
          for(int i = 0; i < r - l; i++)
          {
              int topLeft = matrix[t][l + i];
              matrix[t][l + i] = matrix[b - i][l];
              matrix[b - i][l] = matrix[b][r - i];
              matrix[b][r - i] = matrix[t + i][r];
              matrix[t + i][r] = topLeft;
              
          }
          r -= 1;
          l += 1;
          t++;
          b--;
      }
  }
	public static void main(String[] args) {
		int[][]matrix= {{1,2},{3,4}};
		rotate(matrix);
		for(int[]n:matrix) {
			for(int num:n)
				System.out.println(num);
		}
	}

}
