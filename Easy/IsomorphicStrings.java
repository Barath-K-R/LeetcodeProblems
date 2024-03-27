package Easy;

import java.util.HashMap;

public class IsomorphicStrings {

	public static boolean isomorphic(String s1,String s2) {
		HashMap ms1=new HashMap(),ms2=new HashMap();
		
		for(int i=0;i<s1.length();++i)
		{
			System.out.println(i);
			System.out.println(ms1.containsKey(s1.charAt(i))+" "+ms2.containsKey(s2.charAt(i)));
			if(!ms1.containsKey(s1.charAt(i)) && !ms2.containsKey(s2.charAt(i)))
			{
				System.out.println(s1.charAt(i)+"->"+s2.charAt(i));
				System.out.println(s2.charAt(i)+"->"+s1.charAt(i));
				ms1.put(s1.charAt(i), s2.charAt(i));
				ms2.put(s2.charAt(i), s1.charAt(i));
			}
			else 
			{
				if(ms1.containsKey(s1.charAt(i)))
				{
					System.out.println("s1 s2"+s1.charAt(i)+" "+s2.charAt(i));
				   if((char)ms1.get(s1.charAt(i))!=s2.charAt(i))
				       return false;
				   else
				      continue;
				}
				else if(ms2.containsKey(s2.charAt(i))) {
					System.out.println("s2 s1"+ms2.get(s2.charAt(i))+" "+s1.charAt(i));
					if((char)ms2.get(s2.charAt(i))!=s1.charAt(i)) 
						return false;
					else
						continue;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bar",s2="foo";
		
		System.out.println(isomorphic(s1,s2));
		

	}

}
