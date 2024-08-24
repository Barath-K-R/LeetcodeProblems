package arrays;

import java.util.Arrays;

/**
 * SubArraySumEqualsK
 */
public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count=0,l=0,r=0,currsum=nums[0];
        while(l<nums.length){
            System.out.println("sum="+currsum);
            System.out.println(l+" "+r);
            if(r<l)
            r=l;
            if(currsum>=k){
                if(currsum==k)
                count++;
                currsum=updateSum(currsum, nums[l]);
                l++;
            }
            else{
                
                if(r<nums.length-1){
                    r++;
                    currsum+=nums[r];
                }
                else{
                    currsum=updateSum(currsum, nums[l]);
                    l++;
                }
            }
        }
        return count;
    }

    public static int updateSum(int currsum,int left){
        System.out.println(currsum+"  "+left );
         if(left<0){
            currsum=currsum+Math.abs(left);
         }
         else
         currsum-=left;
         return currsum;
    }
    public static void main(String[] args) {
          int[]nums={-1,-1,1};
          int k=0;
          System.out.println(subarraySum(nums, k));
    }
    
}