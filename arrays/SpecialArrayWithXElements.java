package arrays;

import java.util.Arrays;

/**
 * SpecialArrayWithXElements
 */
public class SpecialArrayWithXElements {
    public static int specialArray(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0)
                continue;
            int n = nums[i];
            if (n > nums.length)
                n = nums.length;
            count[n - 1] += 1;
        }
        int r = 0;
        for (int j = count.length - 1; j >= 0; j--) {
            r += count[j];
            if (r == (j + 1))
                return r;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 7, 7, 0 };
        System.out.println(specialArray(nums));
    }
}