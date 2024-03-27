package Easy;

public class SearchInsertposition {

	public static int search(int []a,int value) {
		int l=0,r=a.length-1;
		
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(a[mid]==value)
				return mid;
			else if(value<a[mid])
				r=mid-1;
			else if(value>a[mid])
				l=mid+1;
		}
		return l;
	}
	public static void main(String[] args) {
	     int []nums= {1,3,5,6};
	    System.out.println(search(nums,7));
	     
	}
}
