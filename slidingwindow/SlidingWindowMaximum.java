package slidingwindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

	public static int[] solution(int[] nums,int k) {
		int[]res=new int[nums.length-(k-1)];
		int temp=0,l=0,r=0;
		Deque<Integer>qDeque=new LinkedList<Integer>();
		for(int i=0;i<nums.length;++i)
		{
			
			while(!qDeque.isEmpty() && nums[i]>qDeque.peekLast())
			{
				
				qDeque.pollLast();
			}
			qDeque.offer(nums[i]);
			if(i>=k-1)
			res[temp++]=qDeque.peekFirst();
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {1,3,-1,-3,5,3,6,7};
        int k=3;
        int[]res=solution(nums,k);
        for(int n:res)
        	System.out.println(n);
	}

}
