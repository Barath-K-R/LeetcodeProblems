package Easy;

public class ValidPalindrome {

	public static boolean isValid(String s) {
		int l=0,r=s.length()-1;
		while(l<r) {
			while(l<r && !isalphanumeric(s.charAt(l)))
			l++;
			while(l<r && !isalphanumeric(s.charAt(r)))
			r--;
			
			if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
				return false;
			++l;
			--r;
			
		}
		return true;
	}
	public static boolean isalphanumeric(Character c) {
		if((c>=65 && c<=90) || (c>=97 && c<=122)|| (c>=48 && c<=57))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="race A car";
		
		System.out.println(isValid(s));

	}

}
