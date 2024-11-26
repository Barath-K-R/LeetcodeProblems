package greedy;

public class JumpGame2 {
    public static int jump(int[] nums) {
        int res = 0, l = 0, r = 0;

        while (r < nums.length - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums= {2,3,1,1,4};
       System.out.println(jump(nums));
    }
}
