package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KCLosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], 
                                      a[0] * a[0] + a[1] * a[1])
        );

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
        }
        return res;
    }
    public static void main(String[] args) {
        int[][]points={{3,3},{5,-1},{-2,4}};
        int k=2;
        int[][]result=kClosest(points, k);
        for(int[]res:result)
        System.out.println(res[0]+" "+res[1]);
    }
}
