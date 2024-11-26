package twopointers;
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int a=nums[i];
                nums[i]=nums[j];
                nums[j]=a;
                i++;j++;
            }
            else
              j++;
        }
       
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int n:nums)
        System.out.println(n);
    }
}
