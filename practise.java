import java.util.*;

/**
 * practise
 */
public class practise {

    public static int recursion(int[] nums) {
        int l = 1, r = 1, last = nums[0], count = 1;
        while (r < nums.length) {
            if (nums[r] == last && count < 2) {
                count++;
                nums[l] = nums[r];
                l++;
            } else if (nums[r] != last) {
                last = nums[r];
                count = 1;
                nums[l] = nums[r];
                l++;
            }
            r++;

        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        recursion(nums);
        for (int n : nums)
            System.out.println(n);
    }
}