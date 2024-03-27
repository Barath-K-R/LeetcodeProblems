package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElement {

	public static List<Integer> solution(int []arr,int k,int x) {
		List res=new ArrayList<Integer>();
		int l=0,r=arr.length-1,index=0,mid=0,target=0,min=0;
		
		while(l<r) {
			System.out.println("loop");
			mid=(l+r)/2;
			
			if(arr[mid]==x)
			{
				target=mid;
				break;
			}
			else if(x<arr[mid])
				r=mid-1;
			else if(x>arr[mid])
				l=mid+1;
		}
		if((l<0 || r<0))
		{
				l=r=0;
				target=-1;
		}
		else if(l>=arr.length || r>=arr.length)
		{
			l=r=arr.length-1; 
			target=-1;
		}
		if(target==0)
		{
			min=Math.min(x-arr[l-1],arr[r+1]-x);
			min=Math.min(arr[l], min);
			target=min;
		}
		System.out.println(l+" "+r);
		l=r=target;
		System.out.println("target="+target);
		while((r-l+1)<k)
		{
			if(l==0)
			{
				
				l=0;
				while(r-l+1<k)
					r++;
				
				break;
			}
			else if(r==arr.length-1)
			{
				
				r=arr.length-1;
				while(r-l+1<k)
					l--;
				break;
			}
			
			if(arr[target]-arr[l-1]<=arr[r+1]-arr[target] )
			l--;
			else if(arr[target]-arr[l-1]>arr[r+1]-arr[target])
				r++;
			
		}
		
			
		for(l=l;l<=r;++l)
			res.add(arr[l]);
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {1,2,3,4,5};
        int k=9,x=-1;
        System.out.println(solution(arr,k,x));
	}

}
