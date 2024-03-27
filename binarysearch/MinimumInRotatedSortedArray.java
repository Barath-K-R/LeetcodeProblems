package binarysearch;

public class MinimumInRotatedSortedArray {

	public static int  solution(int[]nums) {
		int l=0,r=nums.length-1,mid=0,min=Integer.MAX_VALUE;
		
		while(l<=r)
		{
			mid=(l+r)/2;
			if(nums[l]<nums[mid] && nums[r]>nums[mid])
				r=mid-1;
			else if(nums[r]<nums[mid] && nums[l]>nums[mid])
			l=mid+1;
			else if(nums[l]<nums[mid] && nums[r]<nums[mid])
			l=mid+1;
			else if(nums[l]>nums[mid] && nums[r]>nums[mid])
			{
				min=Math.min(min, nums[mid]);
				r=mid-1;
			}
			else if(nums[l]==nums[mid] || (nums[r]<nums[mid] || nums[r]==nums[mid]))
			{
				min=Math.min(min, nums[mid]);
				l=mid+1;
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums= {11,13,15,17};
		System.out.println(solution(nums));
	}

}
