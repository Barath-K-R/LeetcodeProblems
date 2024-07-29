package MathAndGeometry;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
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
		int x=121;
		System.out.println(isPalindrome(x));

	}

}
