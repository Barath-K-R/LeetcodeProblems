package dynamicprogramming;

import java.nio.channels.Channels;

import javax.print.DocFlavor.CHAR_ARRAY;

public class PalindromicSubstrings {

	public static int solution(String s)
	{
		int l=0,r=0,count=0;
		for(int i=0;i<s.length();++i)
		{
			l=r=i;
			System.out.println(i+"th loop");
			while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
			{
				System.out.println(l+" "+r+s.substring(l,r+1));
				count++;
				l--;
				r++;
			}
			l=i;
			r=i+1;
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
				{
					System.out.println(l+" "+r+s.substring(l,r+1));
					count++;
					l--;
					r++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string="aaa";
        System.out.println(solution(string));
	}

}
