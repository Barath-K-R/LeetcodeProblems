package MathAndGeometry;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

	public static void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>(), columnSet = new HashSet<>();
        boolean rowZero=false;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    if(i==0)
                    rowZero=true;
                    else
                    matrix[i][0]=0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; ++i) {
            for (int j = 1; j < matrix[0].length; ++j) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<matrix.length;++i)
            matrix[i][0]=0;
        }

        if(rowZero){
            for(int j=0;j<matrix[0].length;++j)
            matrix[0][j]=0;
        }
    }
	public static void main(String[] args) {
		int[][]matrix= {{0,1},{1,1}};
		for(int[]n:matrix) {
			for(int num:n)
				System.out.print(num);
			System.out.println();
		}

	}

}
