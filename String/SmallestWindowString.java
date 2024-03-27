package String;

import java.util.*;

public class SmallestWindowString {
	static int start=0,end=0;
	public static void minwindow(String s,String pattern) {
		HashMap<Character,Integer>window=new HashMap<Character,Integer>(),count=new HashMap<Character,Integer>();;
	    int have=0,need=pattern.length(),len=0,p=0;
	    
	    for(int i=0;i<pattern.length();++i)
	    {
	    	window.put(pattern.charAt(i), 0);
	    	if(count.containsKey(pattern.charAt(i)))
	    	{
	    		System.out.println(pattern.charAt(i));
	    		count.put(pattern.charAt(i), count.get(pattern.charAt(i))+1);
	    	}
	    	else
	    	{
	    		
	    	    count.put(pattern.charAt(i), 1);
	    	}
	    }
	    while(p<=s.length()) {
	    	
	    	if(have!=need)
	    	{
	    	    if(p<s.length() && pattern.contains(s.substring(p,p+1)))
	    	    {
	    	    	System.out.println("contains "+s.substring(p,p+1)+" "+p);
	    		     int windowcount=window.get(s.charAt(p)),patterncount=count.get(s.charAt(p));
	    		     window.put(s.charAt(p), windowcount+1);
	    		     if(windowcount<patterncount)
	    		     {
	    			     have++;
	    			     System.out.println("have="+have+" "+"need="+need);
	    		     }
	    	   }
	    	     p++;
	    	}
	    	else {
	    		
	    		end=p-1;
	    		len=end-start+1;
	    		System.out.println("start="+start+" end="+end);
	    		while(have==need)
	    		{
	    			 if(end-start+1 <len)
	    				 len=end-start+1;
	    			 System.out.println(s.substring(start,start+1));
	    		    if(pattern.contains(s.substring(start,start+1))) 
	    		    		
	    		    {
	    		    	if((window.get(s.charAt(start))==count.get(s.charAt(start))))
	    		    	have--;
	    		        window.put(s.charAt(start), window.get(s.charAt(start))-1);
	    		    }
	    		    start++;
	    		    System.out.println(start);
	    		
	    		}
	    		System.out.println("final strta="+start);
	    	}
	    }
	}
	public static void main(String[] args) {
		minwindow("adobecodebanc","abc");
		
		System.out.println(start-1+" "+end);
		
	}

}
