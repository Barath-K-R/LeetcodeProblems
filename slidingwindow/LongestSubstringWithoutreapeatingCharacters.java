package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutreapeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bbbbb";
		int max=0,start=0;
		Set st=new HashSet();
		for(int i=0;i<s.length();++i)
		{
			if(!st.contains(s.charAt(i)))
				st.add(s.charAt(i));
			else
			{
				while(st.contains(s.charAt(i)))
				{
					st.remove(s.charAt(start));
					start++;
				}
				st.add(s.charAt(i));
			}
			if(st.size()>max)
				max=st.size();
		}
		System.out.println(max);

	}

}
