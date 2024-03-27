package binarysearch;

public class SearchInARotatedArray2 {

	public static boolean solution(int[]nums,int target)
	{
		int l=0,r=nums.length-1,mid=0;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(target==nums[mid])
				return true;
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
		return true;
		else 
			return false;
		
	}
	public static void main(String[] args) {
		int []nums= {1,0,1,1,1};
		int target=0;
		System.out.println(solution(nums,target));

	}


}
