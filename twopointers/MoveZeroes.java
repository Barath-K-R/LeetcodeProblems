public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int r = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
               
                r = i + 1;
                while (r < nums.length && nums[r] == 0) {
                    r++;
                }
                
                if (r < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[r];
                    nums[r] = temp;
                }
            }
        }
       
    }

    public static void main(String[] args) {
        int[] nums = { 0 };
        moveZeroes(nums);
    }
}
