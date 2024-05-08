package arrays;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int p = 0;
        for (int i = 0; i < t.length(); ++i) {
            if (p >= s.length())
                break;
            if (s.charAt(p) == t.charAt(i)) {
                p++;
                continue;
            }
        }
        if (p < s.length())
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
