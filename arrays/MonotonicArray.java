package arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
            boolean increase=true,decrease=true;
            for(int i=1;i<nums.length;++i){
                if(!(nums[i]>=nums[i-1]))
                increase=false;
                if(!(nums[i]<=nums[i-1]))
                decrease=false;
            }
            
            return increase || decrease;
    }
    public static void main(String[] args) {
        int[]nums={6,5,4,4};
        System.out.println(isMonotonic(nums));
    }
}
