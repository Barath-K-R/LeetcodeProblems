package binarysearch;

public class ArrangeCoins {

	public static int solution(int n) {
		int l=1,r=n,mid=0,res=0;
		while(l<=r) {
			 mid=(l+r)/2;
			 
			 if(((mid/2.0)*(mid+1))==n)
				 return mid;
			 else if(((mid/2.0)*(mid+1))>n)
			 {
				 res=mid;
		         r=mid-1;
			 }
			 else if(((mid/2.0)*(mid+1))<n)
			 {
				 l=mid+1;
			 }
		}
		
		return mid-1;
	}
	public static void main(String[] args) {
		int n=2;
		System.out.println(solution(n));

	}

}
