package arrays;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
    	int totalsum=0;
    	for(int i=0;i<nums.length;++i) {
    		totalsum=totalsum+nums[i];
    	}
    	int leftsum=0,rightsum=0;
    	for(int j=0;j<nums.length;++j) {
    		rightsum=totalsum-leftsum-nums[j];
    		if(leftsum==rightsum) {
    			return j;
    		}
    		leftsum+=nums[j];
    	}
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {2,1,-1};
        System.out.println(pivotIndex(nums));
	}

}
