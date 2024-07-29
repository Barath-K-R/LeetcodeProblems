package MathAndGeometry;

public class SpiralMatrix2 {
	public static int[][] generateMatrix(int n) {
        int[][]matrix=new int[n][n];
        int count=1;
        int left=0,right=matrix.length-1,top=0,bottom=matrix.length-1;
        while(top<bottom && left<right){
            for(int i=top;i<=right;++i)
                  matrix[top][i]=count++;
            top++;
            for(int i=top;i<=right;++i)
                matrix[i][right]=count++;
            right--;
            for(int i=right;i>=left;--i)
                matrix[bottom][i]=count++;
            bottom--;
            for(int i=bottom;i>=top;--i)
                matrix[i][left]=count++;
            left++;

        }
        if(n%2!=0)
        matrix[n/2][n/2]=count;
        return matrix;
    }
	public static void main(String[] args) {
		int n=3;
		int[][]res=generateMatrix(n);
		for(int[]num:res) {
			for(int m:num)
				System.out.print(m);
			System.out.println();
		}
	}
}
