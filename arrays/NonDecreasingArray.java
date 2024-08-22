package arrays;

import java.util.Stack;

/**
 * NonDecreasingArray
 */
public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        boolean changed=false;
        for(int i=0;i<nums.length-1;++i){
           if(nums[i]<=nums[i+1])
           continue;
           if(changed) 
           return false;

           if(nums[i+1]>nums[i-1])
           nums[i]=nums[i+1];
           else
           nums[i+1]=nums[i];
           changed=true;
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[]nums={3,4,2,3};
        System.out.println(checkPossibility(nums));

    }
}