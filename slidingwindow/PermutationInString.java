package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static boolean check(String s1,String s2) {
		int []s1count=new int[26],s2count=new int[26];
		if(s1.length()>s2.length())
			return false;
		
		for(int i=0;i<s1.length();++i)
		{
			s1count[s1.charAt(i)-'a']=s1count[s1.charAt(i)-'a']+1;
			
			s2count[s2.charAt(i)-'a']=s2count[s2.charAt(i)-'a']+1;
			
		}
		int matches=0;
		
		for(int j=0;j<26;++j)
		{
			if(s1count[j]==s2count[j])
				matches++;
		}
		System.out.println("start"+matches);
		System.out.println(s1count[1]+" "+s2count[1]);
		if(matches==26)
			return true;
		int start=0;
		for(int i=s1.length();i<s2.length();++i)
		{
			System.out.println("start="+start+" "+s2.charAt(start));
			s2count[s2.charAt(start)-'a']=s2count[s2.charAt(start)-'a']-1;
			System.out.println("count "+s2count[s2.charAt(start)-'a']);
			if((s1count[s2.charAt(start)-'a']!=(s2count[s2.charAt(start)-'a']+1))
					&& s1count[s2.charAt(start)-'a']==s2count[s2.charAt(start)-'a'])
			{
				System.out.println("++");
				matches++;
			}
			else if((s1count[s2.charAt(start)-'a']==s2count[s2.charAt(start)-'a']+1)
					&& s1count[s2.charAt(start)-'a']!=s2count[s2.charAt(start)-'a'])
			{
				System.out.println("--");
				matches--;
			}
			start++;
			s2count[s2.charAt(i)-'a']=s2count[s2.charAt(i)-'a']+1;
			System.out.println(s2.charAt(i)+" "+s1count[s2.charAt(i)-'a']+" "+s2count[s2.charAt(i)-'a']);
			if(s1count[s2.charAt(i)-'a']==s2count[s2.charAt(i)-'a'])
			{
				System.out.println(matches+"match ++"+(matches+1));
				matches++;
			}
			else
				matches--;
			
			System.out.println(matches);
			if(matches==26)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc",s2="cccccbabbbaaaa";
		System.out.println(check(s1,s2));
		
		
		

	}

}
