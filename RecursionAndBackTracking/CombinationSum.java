package RecursionAndBackTracking;

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        recursion(0, candidates, target, ans, ds);
        return ans;
    }
    public static void recursion(int index,int[]arr,int target,List<List<Integer>>ans, List<Integer>ds){
        
        if(index>=arr.length){
            if(target==0)
            ans.add(new ArrayList<>(ds));
            return;
        }
        

        if(arr[index]<=target){
            ds.add(arr[index]);
            recursion(index, arr, target-arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        recursion(index+1, arr, target, ans, ds);
    }
    public static void main(String[] args) {
        int[]candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates, target));
    }
}
