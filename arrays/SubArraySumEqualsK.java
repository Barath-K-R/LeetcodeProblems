package arrays;

import java.util.*;

/**
 * SubArraySumEqualsK
 */
public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            if(map.containsKey(sum-k))
            count+=map.get(sum-k);
            
            //adding prefix sum to map
            if(map.containsKey(sum))
            map.put(sum,map.get(sum)+1);
            else
            map.put(sum,1);
        }
        return count;
    }
    public static void main(String[] args) {
          int[]nums={1,2,3};
          int k=3;
          System.out.println(subarraySum(nums, k));
    }
    
}