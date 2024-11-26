package greedy;

public class JumpGame {
	public static int jump(int[] nums) {
		return dfs(nums, 0);
    }

	public static int dfs(int[] nums, int i) {
        if (i == nums.length - 1) {
            return 0;
        }
        if (nums[i] == 0) {
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        int end = Math.min(nums.length - 1, i + nums[i]);
        for (int j = i + 1; j <= end; j++) {
            res = Math.min(res, 1 + dfs(nums, j));
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]nums= {2,3,1,1,4};
       System.out.println(jump(nums));
	}

}
