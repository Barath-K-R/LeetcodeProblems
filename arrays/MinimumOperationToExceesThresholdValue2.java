package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumOperationToExceesThresholdValue2 {
	public static int solution(int[]nums,int k) {
		int res=0;
		
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		
		for(int i=0;i<nums.length;++i)
		p.add(nums[i]);
		
		while(!p.isEmpty())
		{
			if(p.peek()>=k)
				break;
			else {
				System.out.println("p="+p);
				int n1=p.poll(),n2=p.poll(),add=0;
				add=Math.min(n1, n2) * 2 + Math.max(n1, n2);
				p.add(add);
				res++;
				
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {999999999,999999999,999999999};
		int k=1000000000;
        System.out.println(solution(nums,k));

	}

}
