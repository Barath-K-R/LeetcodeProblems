package RecursionAndBackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
     public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
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
        while(i<nums.length-1 && nums[i]==nums[i+1])
            i++;
        
        list.remove(list.size()-1);
        dfs(nums, i+1, list, res);
    }
    public static void main(String[] args) {
        int[]nums={1,2,1};
        List<List<Integer>>res=subsetsWithDup(nums);
        System.out.println(res);
    }
}
