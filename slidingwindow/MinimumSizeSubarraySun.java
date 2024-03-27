package slidingwindow;

public class MinimumSizeSubarraySun {

	public static int solution(int []nums,int target)
	{
	     int l=0,r=0,sum=0,res=Integer.MAX_VALUE;
	     for(r=r;r<nums.length;++r)
	     {
	    	 sum=sum+nums[r];
	    	 if(sum>=target)
	    	 {
	    		 
	    		 while(sum>=target)
	    		 {
	    			 res=Math.min(r-l+1, res);
	    			 sum=sum-nums[l];
	    			 l++;
	    		 }
	    	 }
	    	 
	     }
	     if(res==Integer.MAX_VALUE)
	    	 return 0;
	     else
	     return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {1,4,4};
        int target=11;
        System.out.println(solution(nums,target));
        
	}

}
