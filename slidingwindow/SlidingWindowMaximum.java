package slidingwindow;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {

	public static int[] solution(int[] nums,int k) {
		int []res=new int[nums.length-k+1];
		int i=0,l=0,r=0;
		PriorityQueue<Integer>p=new PriorityQueue<Integer>((a, b) -> b - a);
		for(i=0;i<k;++i)
		{
			if(!p.contains(nums[i]))
				p.add(nums[i]);
		}
		int temp=0;
		for(r=i;r<nums.length;++r)
		{
			
			res[temp++]=p.peek();
			if(p.contains(nums[l]))
			l++;
			p.add(nums[r]);
		}
		res[temp++]=p.peek();
			return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]nums= {9,10,9,-7,-4,-8,2,-6};
        int k=5;
        int[]res=solution(nums,k);
        for(int n:res)
        	System.out.println(n);
	}

}
