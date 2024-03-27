package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

	public static int[] solution(int[]nums,int k) {
	    int[]res=new int[k];
	    HashMap<Integer,Integer>h=new HashMap<Integer, Integer>();
	    PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(new Comparator <Map.Entry<Integer,Integer>> (){

            @Override
            public int compare (Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b)
            {
                return b.getValue().compareTo(a.getValue());
            }

        });
		for(int i=0;i<nums.length;++i)
		{
			if(h.containsKey(nums[i]))
				h.put(nums[i],h.get(nums[i])+1);
			else
				h.put(nums[i],1);
		}
		for(Map.Entry<Integer,Integer>entry:h.entrySet())
			pq.add(entry);
		int l=0;
		while(!pq.isEmpty()&& l<k)
		{
			res[l]=pq.poll().getKey();
			l++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,1,2,2,3,3,3,4,5};
		int k=2;
		int []res=solution(nums, k);
		System.out.println("res");
		for(int n:res)
			System.out.println(n);

	}

}
