package arrays;

import java.util.LinkedList;
import java.util.List;

public class FactorailOfLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,temp=2,carry=0;
		LinkedList<Integer>l=new LinkedList<Integer>();
		l.add(1);
		while(temp<=n) {
			carry=0;
			System.out.println("size="+l.size()+" temp="+temp);
			for(int i=l.size()-1;i>=0;--i)
			{
				System.out.println(l.get(i)+" * "+temp);
				int prod=l.get(i)*temp;
				prod=prod+carry;
				System.out.println("prod="+prod);
				if(prod/10>0)
				{
					carry=prod/10;
					l.set(i, prod%10);
				}
				else {
					l.set(i, prod);
					carry=0; 
				}
				System.out.println("carry="+carry);
			}
			if(carry!=0)
				l.addFirst(carry);
				
			System.out.println("limkedlist");
			for(int j=0;j<l.size();++j)
				System.out.print(l.get(j)+" ");
			temp++;
		}
		for(int j=0;j<l.size();++j)
			System.out.print(l.get(j)+" ");

	}

}
