package binarysearch;

import java.util.*;

public class MinimizeTheMaximumDifferenceOfpairs {

	public static int solution(int[] nums, int p) {
		Arrays.sort(nums);
		PriorityQueue<Integer>pQueue=new PriorityQueue<Integer>(Collections.reverseOrder());
		pQueue.add(Integer.MAX_VALUE);
		
		for(int i=0;i<nums.length;++i)
		{
			
		}
		
		return pQueue.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,1,2};
		int p = 1;
		System.out.println(solution(nums, p));

	}

}
