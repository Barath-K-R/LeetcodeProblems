package binarysearch;

public class FindPeakElement {

	public static int solution(int[]nums) {
		for(int i=0;i<nums.length;++i)
		{
			
			if((nums.length==1)|| (i==0 && nums[i]>nums[i+1]) || (i==nums.length-1) && nums[i]>nums[i-1])
				return nums[i];
			if(i>0 && i<nums.length && nums[i]>nums[i-1] && nums[i]>nums[i+1])
				return nums[i];
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []nums= {1};
         System.out.println(solution(nums));
	}

}
