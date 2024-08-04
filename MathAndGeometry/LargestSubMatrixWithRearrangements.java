package MathAndGeometry;

import java.util.PriorityQueue;

public class LargestSubMatrixWithRearrangements {
    public static int largestSubmatrix(int[][] matrix) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; ++i) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 1)
                    count++;
            }

            pq.add(count);
        }
        System.out.println(pq);
        return 1;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1 } };
        System.out.println(largestSubmatrix(matrix));
    }
}
