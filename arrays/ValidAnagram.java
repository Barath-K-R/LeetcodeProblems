package arrays;

import java.util.HashMap;

import org.xml.sax.ext.Attributes2;

public class ValidAnagram {

	public static boolean solution(String s,String t) {
		if(s.length()!=t.length())
			return false;
		HashMap<Character,Integer>h1=new HashMap<Character, Integer>(),h2=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();++i)
		{
			if(h1.containsKey(s.charAt(i)))
			h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
			else
			h1.put(s.charAt(i),1);
			
			if(h2.containsKey(t.charAt(i)))
				h2.put(t.charAt(i),h2.get(t.charAt(i))+1);
				else
				h2.put(t.charAt(i),1);
		}
		
		if(h1.equals(h2))
		return true;
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagram",t="nagaram";
		System.out.println(solution(s, t));

	}

}
