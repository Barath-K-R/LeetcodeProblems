package arrays;

import java.util.Stack;

/**
 * NonDecreasingArray
 */
public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int count=0;
        for(int i=0;i<nums.length;++i){
            if(!st.isEmpty() && nums[i]<st.peek())
            count++;
            
            
            st.push(nums[i]);
            if(count>1)
            return false;
        
        }
        System.out.println(count);
        return true;
    }
    public static void main(String[] args) {
        int[]nums={4,2,1};
        System.out.println(checkPossibility(nums));

    }
}