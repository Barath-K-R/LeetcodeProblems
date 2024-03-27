package Heap;

import java.util.*;

public class TopKElement {

	public static ArrayList<Integer> topk(int []a,int k) {
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;++i)
		{
			if(h.containsKey(a[i]))
			{
				int prevvalue=h.get(a[i]);
				h.put(a[i],prevvalue+1);
			}
			else
				h.put(a[i], 1);
		}
		ArrayList<Integer>[] arr = new ArrayList[a.length+1];
		
		for(Map.Entry<Integer,Integer>entry:h.entrySet())
		{
			int index=entry.getValue();
			arr[index]=new ArrayList<Integer>();
			arr[index].add(entry.getKey());
		}
		
		ArrayList<Integer>res=new ArrayList<Integer>();
		int temp=1;
		for(int j=arr.length-1;j>=0;--j){
			if(arr[j]==null)
			continue;
			
			else {
				for(int l=0;l<arr[j].size();++l)
				{
					if(temp>k)
						return res;
					res.add(arr[j].get(l));
					temp++;
				}
			}
			
			
		}
		return res;
		
	}
	public static void main(String[] args) {
		int []a= {1,1,1,2,2,3};
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		int k=3;
		ArrayList<Integer>res=topk(a,k);
		
		for(int n:res)
			System.out.println(n);
		
	}
}
