package arrays;

public class Largest3SameDigitNumberInString {
    public static String largestGoodInteger(String num) {
        int count = 0, max = -1;
        for (int i = 0; i < num.length() - 2; ++i) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2))
                max = Math.max(max, num.charAt(i)-'0');
        }
        if (max == -1)
            return "";
        else
            return max + "" + max + "" + max;
    }

    public static void main(String[] args) {
        String num = "42352338";
        System.out.println(largestGoodInteger(num));
    }
}
