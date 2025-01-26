package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        backtrack(res,new ArrayList<>(), nums);
        return res;
    }

    public static void backtrack(List<List<Integer>>res,List<Integer> list, int[] nums) {
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;++i){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtrack(res, list, nums);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[]nums={2,3,4};
        List<List<Integer>>res=permute(nums);
        System.out.println(res);
    }
}
