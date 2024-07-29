package MathAndGeometry;

public class TransposeMatrix {
	public static int[][] transpose(int[][] matrix) {
        int row = matrix.length, column = matrix[0].length;
       int[][] res = new int[column][row];
       for (int i = 0; i < row; ++i) {
           for (int j = 0; j < column; ++j) {
               res[j][i] = matrix[i][j];
           }
       }
       return res;
   }
     public static void main(String[] args) {
		int[][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]res=transpose(matrix);
		for(int[]n:res) {
			for(int num:n)
				System.out.println(num);
		}
	}
}
