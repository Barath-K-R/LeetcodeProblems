package slidingwindow;

import java.util.HashMap;

public class LongestRepeatingcharacterReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="EOEMQLLQTRQDDCOERARHGAAARRBKCCMFTDAQOLOKARBIJBISTGNKBQGKKTALSQNFSABASNOPBMMGDIOETPTDICRBOMBAAHINTFLH";
		int k=1;
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		int start=0,t=0,max=0,windowcount=0,res=0;
		for(int i=0;i<s.length();++i)
		{
			windowcount++;
			if(h.containsKey(s.charAt(i)))
			{
				if(h.get(s.charAt(i))+1>max)
					max=h.get(s.charAt(i))+1;
			   h.put(s.charAt(i), h.get(s.charAt(i))+1);
			  
			}
			else
			{
				if(max<1)
					max=1;
				h.put(s.charAt(i), 1);
			}
			
			if(windowcount-max<=k)
				res=windowcount;
			else
			{
				
				while(windowcount-max>k)
				{
					
					h.put(s.charAt(start), h.get(s.charAt(start))-1);
					
					start++;
					windowcount--;
					max=0;
					for(Character c:h.keySet())
					{
						if(h.get(c)>max)
							max=h.get(c);
					}
					
				}
			}
			
		}
		System.out.println(res);

	}

}
