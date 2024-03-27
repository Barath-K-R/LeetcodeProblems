package Easy;

import java.util.Scanner;

public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt(),res=0,max=2147483647,min=-2147483647,flag=1;
		
		while(num>0)
		{
			System.out.println(res);
			int digit=num%10;
			num=num/10;
			if(res>max/10 || res==max/10 && digit>max%10)
			{
				flag=0;
				break;
			}
			if(res<min/10 || res==min/10 && digit<min%10)
			{
				flag=0;
				break;
			}
			res=(res*10)+digit;
			
			
		}
		if(flag==0)
			System.out.println("false");
		else
			System.out.println(res);

	}

}
