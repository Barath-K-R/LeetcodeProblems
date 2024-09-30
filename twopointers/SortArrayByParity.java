package twopointers;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int l=0,r=0;
        while(r<nums.length){
            if(nums[r]%2==0){
               
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
            }
            r++;
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int[]nums={3,1,2,4};
        sortArrayByParity(nums);
        for(int n:nums)
        System.out.println(n);
    }
}
