public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1, nums);
        reverse(k, nums.length-1, nums);
    }

    public static void reverse(int l,int r,int[]nums){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }

    }
    public static void main(String[] args) {
        int[] nums = {-1};
        rotate(nums, 2);
    }
}
