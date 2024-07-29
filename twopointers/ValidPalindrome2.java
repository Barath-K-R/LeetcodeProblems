package twopointers;
public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return validPalindromeHelper(s, l + 1, r) || validPalindromeHelper(s, l, r - 1);
            }
        }
        return true;
    }

    public static boolean validPalindromeHelper(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abadd";
        System.out.println(validPalindrome(s));
    }
}
