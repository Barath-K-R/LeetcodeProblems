package MathAndGeometry;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        System.out.println(mat.length);
        boolean isOdd=mat.length%2!=0?true:false;
        int mid=mat.length/2,count=0;
        for(int i=0;i<mat.length;++i){
            if(isOdd && i==mid)
            continue;
            count+=mat[i][i];
            count+=mat[i][mat.length-1-i];
        }
        if(isOdd)
        count+=mat[mid][mid];
        return count;
    }
    public static void main(String[] args) {
        int [][]mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(mat));
    }
}
