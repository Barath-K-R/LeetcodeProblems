package arrays;

public class ProductOfArrayExceptSelf {

	public static int[] solution(int[]nums) {
		int start=1,end=1;
	    int[]res=new int[nums.length];
		for(int i=0;i<nums.length;++i)
		{
			res[i]=start;
			start=start*nums[i];
		}
		for(int j=nums.length-1;j>=0;--j)
		{
			
			res[j]=end*res[j];
			end=end*nums[j];
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {-1,1,0,-3,3};
        nums=solution(nums);
        for(int n:nums)
        	System.out.println(n);
	}

}
