package Easy;

public class NumberOf1Bits {

	public static int countbits(int n) {
		int count=0,i=0;
		while(n>0)
		{
			System.out.println(i++);
			count=count+(n&1);
			n=n>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		
		System.out.println(countbits(n));

	}

}
