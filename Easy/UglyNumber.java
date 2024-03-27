package Easy;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		int flag=1;
		while(n>1)
		{
			if(n%2==0)
			n=n/2;
			else if(n%3==0)
				n=n/3;
			else if(n%5==0)
				n=n/5;
			else
			{
				flag=0;
				break;
			}
				
			
		}

		if(flag==1)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
