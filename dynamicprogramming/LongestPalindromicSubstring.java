package dynamicprogramming;

public class LongestPalindromicSubstring {

	public static String solution(String s) {
		String res="";
		int l=0,r=0;
		for(int i=0;i<s.length();++i)
		{
			l=r=i;
			while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
			{
				if(s.substring(l,r+1).length()>res.length())
					res=s.substring(l,r+1);
				l--;
				r++;
			}
			l=i;
			r=i+1;
			while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
			{
				if(s.substring(l,r+1).length()>res.length())
					res=s.substring(l,r+1);
				l--;
				r++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		
         String s="cbbd";
         System.out.println(solution(s));
	}

}
