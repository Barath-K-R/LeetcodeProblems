package arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int left = 0, right = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            res[left] = res[right] = nums[i];
            left++;
            right++; 
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] res = getConcatenation(nums);
        for (int n : res) {
            System.out.print(n+" ");
        }
    }
}
