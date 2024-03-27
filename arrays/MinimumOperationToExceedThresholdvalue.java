package arrays;

import java.util.Arrays;

public class MinimumOperationToExceedThresholdvalue {
	public static int solution(int[]nums,int k) {
		int res=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;++i)
		{
			if(nums[i]<k)
				res++;
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,1,2,4,9};
		int k=9;
        System.out.println(solution(nums,k));
	}

}
