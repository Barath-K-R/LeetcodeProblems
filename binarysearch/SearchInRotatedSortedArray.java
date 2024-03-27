package binarysearch;

public class SearchInRotatedSortedArray {

	public static int solution(int[]nums,int target)
	{
		int l=0,r=nums.length-1,mid=0;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(target==nums[mid])
				return mid;
			//left sorted portion
			if(nums[l]<=nums[mid])
			{
				if(target>nums[mid] || target<nums[l])
					l=mid+1;
				else
					r=mid-1;
			}
			//right sorted portion
			else {
				if(target<nums[mid] || target>nums[r])
					r=mid-1;
				else 
					l=mid+1;
			}
			
		}
		if(nums[mid]==target)
		return mid;
		else 
			return -1;
		
	}
	public static void main(String[] args) {
		int []nums= {4,5,6,7,0,1,2};
		int target=9;
		System.out.println(solution(nums,target));

	}

}
