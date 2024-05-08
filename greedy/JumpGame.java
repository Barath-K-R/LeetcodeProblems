package greedy;

public class JumpGame {
	public static boolean check(int[]nums,int index) {
		if(index==nums.length-1)
			return true;
		int temp=1;
		while(temp<=nums[index])
		{
		  if(nums[index]>0)
		  {
		     if(check(nums, index+temp))
		    	 return true;
		  }
		  else 
			return false;
		  temp++;
		}
		return false;
	}
    public static boolean solution(int[]nums) {
    	if(nums.length==1)
    		return true;
    	if(nums[0]>0)
    	return check(nums,0);
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]nums= {4,3,2,1,0,0};
       System.out.println(solution(nums));
	}

}
