package slidingwindow;

import java.util.HashMap;

public class MinimumWindowSubstring {

	public static  String solution(String s,String t)
	{
		if(s.length()<t.length())
			return "";
		int need=t.length(),have=0,l=0,r=0;
		String res=s+s;
		HashMap<Character,Integer>h1=new HashMap<Character,Integer>(),h2=new HashMap<Character,Integer>();
		for(int i=0;i<t.length();++i)
		{
			if(h1.containsKey(t.charAt(i)))
              h1.put(t.charAt(i), h1.get(t.charAt(i))+1);
			else
			{
            	  h1.put(t.charAt(i), 1);
            	  h2.put(t.charAt(i), 0);
			}
		    
	    }
		for(r=r;r<s.length();++r)
		{
			if(h2.containsKey(s.charAt(r)))
			{
				if(h2.get(s.charAt(r))<h1.get(s.charAt(r)))
					have++;
				h2.put(s.charAt(r), h2.get(s.charAt(r))+1);
			}
			System.out.println("r="+s.charAt(r)+" "+h1+" "+h2);
			while(have>=need)
			{
				System.out.println("dec "+s.charAt(l)+" "+h2);
				if(res.length()>s.substring(l,r+1).length())
					res=s.substring(l,r+1);
				if(!h2.containsKey(s.charAt(l)))
					l++;
				else if(h2.containsKey(s.charAt(l)) && (h2.get(s.charAt(l))<=h1.get(s.charAt(l))))
				{
					System.out.println(h2.get(s.charAt(r))+" "+h1.get(s.charAt(r)));
					have--;
					h2.put(s.charAt(l), h2.get(s.charAt(l))-1);
					l++;
				}
				else
				{
					h2.put(s.charAt(l), h2.get(s.charAt(l))-1);
					l++;
				}
				System.out.println("have="+have+" need="+need);
		   }
		}
		if(res.contains(s+s))
			return "";
		return res;
	}
	public static void main(String[]args)
	{
		String s="a",t="b";
		System.out.println(solution(s,t));
		
	}

}
