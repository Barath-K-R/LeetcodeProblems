package twopointers;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        System.out.println("sorting");
        int l=0,r=nums.length-1;
        while(l<r){
            boolean lodd=nums[l]%2!=0?true:false,rodd=nums[r]%2!=0?true:false;
            if(lodd && !rodd){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
            else if(lodd && rodd)
            r--;
            else if(!lodd && !rodd)
            l++;
            else
            {
                l++;
                r--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[]nums={0};
        sortArrayByParity(nums);
        for(int n:nums)
        System.out.println(n);
    }
}
