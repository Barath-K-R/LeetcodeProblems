package dynamicprogramming;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);
    }
    public static void main(String[] args) {
        int[]cost={1,2,1,2,1,1,1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
