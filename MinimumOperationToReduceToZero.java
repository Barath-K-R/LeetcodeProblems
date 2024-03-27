
public class MinimumOperationToReduceToZero {

	public static int solution(int[]nums,int x) {
		int res=Integer.MAX_VALUE,l=0,r=0,sum=0,total=0;
		
		for(int j=0;j<nums.length;++j)
			total=total+nums[j];
		System.out.println("total="+total);
		for(r=r;r<nums.length;++r)
		{
			
			sum=sum+nums[r];
			System.out.println("sum="+sum);
			if(sum==(total-x))
			{
				System.out.println(nums.length-(r-l+1));
				res=Math.min(res,nums.length-(r-l+1));
				System.out.println("sum="+sum+" res="+res);
			}
			if(sum>total-x)
			{
				System.out.println(">="+sum);
				while(sum>total-x && l<=r)
				{
					
					sum=sum-nums[l];
					l++;
					System.out.println(l+" sum="+sum);
				}
				if(sum==total-x)
					res=Math.min(res,nums.length-(r-l+1));
			}
			
		}
		if(res==Integer.MAX_VALUE)
			return -1;
		return res;
	}
	public static void main(String[] args) {
		int[]nums= {1,1};
		int x=3;
		System.out.println(solution(nums,x));

	}

}
