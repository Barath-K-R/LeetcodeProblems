package Easy;

import java.util.*;

public class HappyNumbers {

	public static boolean happynumber(int n) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		int sum=0;
		while(sum!=1)
		{
			sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+(int)Math.pow(digit, 2);
			n=n/10;
		}
		System.out.println(sum);
		if(!s.contains(sum))
		s.add(sum);
		else
		{
			System.out.println("repaeted "+sum);
			return false;
		}
		n=sum;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		System.out.println(happynumber(n));

	}

}
