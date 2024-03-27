package Easy;

import java.util.ArrayList;

public class KthLargestElement {

	public static void heapify(int i,int n,ArrayList<Integer>a) {
		int smallest=i,l=2*i+1,r=2*i+2;
		
		if(l>=n ) 
			return;
		
		if(l<n && a.get(smallest)>a.get(l))
			smallest=l;
		if(r<n && a.get(smallest)>a.get(r))
			smallest=r;
		
		if(smallest!=i)
		{
			int temp=a.get(i);
			a.set(i,a.get(smallest));
			a.set(smallest,temp);
			heapify(smallest,n,a);
		}
	}
	public static void buildheap(int k,int n,ArrayList<Integer>a) {
		for(int i=a.size()/2-1;i>=0;--i)
		{
			heapify(i,n,a);
		}
		
	}
	
	public static void balanceheap(int k,int n,ArrayList<Integer>a) {
		
		int j=1;
        while(j<=(n-k))
        {
       	 a.set(0, a.get(n-1));
       	 a.remove(n-1);
       	 n=n-1;
       	 heapify(0,n,a);
       	 j++;
        }
	}
	public static int add(int k,int value,ArrayList<Integer>a) {
		a.add(value);
		
		int index=a.indexOf(value);
		while(index!=0) {
			int parent=(index-1)/2;
			if(a.get(index)<a.get(parent))
			{
				int temp=a.get(parent);
				a.set(parent, a.get(index));
				a.set(index, temp);
				index=parent;
				continue;
			}
			break;
		}
		int n=a.size();
		
		balanceheap(k,n,a);
		
		return a.get(0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k=3;
         ArrayList<Integer>a=new ArrayList<Integer>();
         a.add(4);
         a.add(5);
         a.add(8);
         a.add(2);
         int n=a.size();
         buildheap(3,n,a);
         
         balanceheap(3,n,a);
         
         
         add(k,3,a);
         add(k,5,a);
         add(k,10,a);
         add(k,9,a);
         System.out.println(add(k,4,a));
         
         
         
        
	}

}
