package RecursionAndBackTracking;

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0,new ArrayList<>(),res, nums, target);
        return res;
    }

    private static void dfs(int i,List<Integer> cur,List<List<Integer>>res,int[] nums, int target) {
        if (target==0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for (int j =i; j < nums.length; j++) {
            if (target-nums[j]<0) {
                break;
            }
            cur.add(nums[j]);
            System.out.println(nums[j]+" "+cur);
            dfs(j,cur, res, nums, target-nums[j]);
            cur.remove(cur.size() - 1);
            
        }
    }
    public static void main(String[] args) {
        int[]candidates={2,5,6,9};
        int target=9;
        List<List<Integer>>res=combinationSum(candidates, target);
        System.out.println(res);
    }
}
