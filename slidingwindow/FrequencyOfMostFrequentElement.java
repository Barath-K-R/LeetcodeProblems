package slidingwindow;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {

	public static int solution(int[]nums,int k)
	{
		Arrays.sort(nums);
		for(int n:nums)
			System.out.println(n);
		int l=0,r=0,total=0,res=0;
		
		while(r<nums.length && nums[r]*(r-l+1)>total+k)
		{
			total=total+nums[r];
			while(nums[r]*((r-l)+1)>(total+k))
			{
				total=total-nums[l];
				l++;
			}
			res=(r-l)+1;
			r++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966};
		int k=3056;
		System.out.println(solution(nums,k));
		

	}

}
