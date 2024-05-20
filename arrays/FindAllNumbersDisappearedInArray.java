package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int position = Math.abs(nums[i]);
            nums[position - 1] = Math.abs(nums[position - 1]) * -1;

        }

        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] > 0) {
                res.add(j + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }
}
