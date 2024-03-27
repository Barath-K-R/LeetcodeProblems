package arrays;

public class SearchRotatedArray {
	public static void main(String[] args) {
		int []a= {5,6,7,8,9,10,1,2,3};
		
		int l=0,r=a.length-1,mid=0,k=6;
		
		while(l<r)
		{
			mid=(l+r)/2;
			System.out.println(mid);
			if(k<a[mid] && k<a[0])
			{
				l=mid+1;
				continue;
			}
			else if(k<a[mid] && k<a[0]){
				r=mid-1;
				continue;
			}
			else if(k>a[mid] && k>a[r])
			{
				r=mid-1;
				continue;
			}
			else if(k>a[mid] && k<a[r]){
				l=mid+1;
				continue;
			}
			
		}
		System.out.println("mid="+mid);
	}
	
}
