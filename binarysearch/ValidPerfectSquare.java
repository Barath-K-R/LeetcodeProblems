package binarysearch;

public class ValidPerfectSquare {

	public static boolean solution(int num) {
		long l=1,r=num;
		while(l<=r)
		{
			long mid=(l+r)/2;
			System.out.println(mid);
			if(mid*mid==num)
				return true;
			else if(num>mid*mid)
				l=mid+1;
			else if(num<mid*mid)
				r=mid-1;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=2147483647;
           System.out.println(solution(num));
	}

}
