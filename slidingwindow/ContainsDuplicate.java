package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,1},k=3;
		Set s=new HashSet<Integer>();
		int left=0,flag=0;
		
		for(int i=0;i<6;++i)
		{
			System.out.println(s);
			if(s.size()>=k+1)
			{
				System.out.println("left="+left);
				System.out.println("a[left]="+a[left]);
				s.remove(a[left]);
				
				left++;
				System.out.println(s);
			}
			if(s.contains(a[i]))
			{
				flag=1;
				break;
			}
			else
			s.add(a[i]);
		}
		if(flag==0)
		System.out.println("false");
		else
			System.out.println("true");

	}

}
