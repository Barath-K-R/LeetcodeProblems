package arrays;

import java.util.HashMap;

public class TwoSum {

	public static int[] solution(int[]nums,int target) {
		// TODO Auto-generated method stub
		int[]res= new int[2];
		HashMap<Integer, Integer>hashMap=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;++i)
		{
			if(!hashMap.containsKey(target-nums[i]))
				hashMap.put(nums[i],i);
			else {
				res[0]=hashMap.get(target-nums[i]);
				res[1]=i;
				return res;
			}
		}
		return res;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {2,7,11,15};
        int target=9;
        int[]res=solution(nums, target);
        for(int n:res)
        	System.out.println(n);
	}

}
