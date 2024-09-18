package dynamicprogramming;

public class HouseRobber2 {
    public static int rob(int[] nums) {
        int oddsum=0,evensum=0;
        for(int i=0;i<nums.length;++i){
            if(i%2==0){
                if(i==nums.length-1)
                continue;
                evensum+=nums[i];
            }
            else
            oddsum+=nums[i];
        }
        return Math.max(evensum,oddsum);
    }
    public static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(rob(nums));
    }
}
