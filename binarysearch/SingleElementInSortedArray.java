package binarysearch;

public class SingleElementInSortedArray {
	public static int solution(int[]nums) {
		int l=0,r=nums.length-1,lcount=0,rcount=0,temp=0,res=0,mid=0;
		while(l<r)
		{
			 mid=(l+r)/2;
			if(nums[mid-1]==nums[mid])
			{
				lcount=(mid-1)-l;
				rcount=r-mid;
				if(lcount%2==1)
					r=mid-2;
				else if(rcount%2==1)
					l=mid+1;
					
			}
			else if(nums[mid+1]==nums[mid])
			{
				rcount=r-(mid+1);
				lcount=mid-l;
				if(rcount%2==1)
					l=mid+2;
				else if(lcount%2==1)
					r=mid-1;
			}
			else
				return nums[mid];
		}
			return nums[l];
				
	}
      public static void main(String[]args) {
    	  int []nums= {1,1,2,3,3,4,4,8,8};
    	  System.out.println(solution(nums));
      }
}
