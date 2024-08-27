package arrays;
import java.util.*;;
public class NumberOfPairsOfInterchangeableRectangles {
    public static long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> count = new HashMap<>();
        for (int[] rec : rectangles) {
            double key = (double) rec[0] / rec[1];
            count.put(key, count.getOrDefault(key, (long) 0) + 1);
        }

        long res = 0;
        for (long c : count.values()) {
            res += c * (c - 1) / 2;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][]rectangles={{4,5},{7,8}};
        System.out.println(interchangeableRectangles(rectangles));
    }
}
