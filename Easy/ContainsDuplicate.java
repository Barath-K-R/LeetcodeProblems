package Easy;

import java.util.*;

public class ContainsDuplicate {

	public static boolean containduplicate(int[]a) {
		ArrayList<Integer>h=new ArrayList<Integer>();
		for(int i=0;i<a.length;++i)
		{
			if(h.contains(a[i]))
				return false;
			
			h.add(a[i]);
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,2,6};
		
		System.out.println(containduplicate(a));
		

	}

}
