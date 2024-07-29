package twopointers;

public class ValidPalindrome {

	public static boolean solution(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println(s);
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab_a";
		System.out.println(solution(s));
	}

}
