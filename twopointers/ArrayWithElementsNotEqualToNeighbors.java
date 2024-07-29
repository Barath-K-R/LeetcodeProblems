package twopointers;

import java.util.Arrays;

public class ArrayWithElementsNotEqualToNeighbors {
    public static int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int l1 = 0, r1 = nums.length - 1, l2 = 0, r2 = 0;
        if (nums.length % 2 == 0)
            r2 = nums.length - 1;
        else
            r2 = nums.length - 2;
        System.out.println(l1 + " " + r1 + " " + l2 + " " + r2);
        while (l1 <= r1) {
            res[l2] = nums[l1];
            l1++;
            l2 = l2 + 2;
            if (r2 > 0)
                res[r2] = nums[r1];
            r1--;
            r2 = r2 - 2;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 6, 2, 0, 9, 7 };
        int[] res = rearrangeArray(nums);
        for (int n : res)
            System.out.println(n);
    }
}
