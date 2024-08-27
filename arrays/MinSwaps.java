package arrays;

/**
 * MinSwaps
 */
public class MinSwaps {
    public static int minSwaps(String s) {
        int extraClosingbrackets = 0, max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== ']') {
                extraClosingbrackets++;
                max = Math.max(extraClosingbrackets, max);
            }
            else 
                extraClosingbrackets--;
        }

        return (max + 1) / 2;
    }
    public static void main(String[] args) {
        String s="][][";
        System.out.println(minSwaps(s));
    }
}