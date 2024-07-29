package twopointers;
public class ReverseString {
    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < r) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
        for (char ch : s)
            System.out.println(ch);
    }

    public static void main(String[] args) {
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(ch);
    }
}
