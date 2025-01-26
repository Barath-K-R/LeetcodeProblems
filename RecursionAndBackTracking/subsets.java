package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, 0, list, res);
        return res;
    }
    
    public static void dfs(int[]nums,int i,List<Integer>list,List<List<Integer>>res){
        if(i>=nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        dfs(nums, i+1, list, res);
        list.remove(list.size()-1);
        dfs(nums, i+1, list, res);
    }
    public static void main(String[] args) {
        int[]nums={1,2,3};
        List<List<Integer>>res=subsets(nums);
        System.out.println(res);
    }
}
