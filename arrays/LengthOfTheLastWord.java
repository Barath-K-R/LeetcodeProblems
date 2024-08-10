package arrays;

public class LengthOfTheLastWord {
    public static int lengthOfLastWord(String s) {
        int start = s.length() - 1, count = 0;
        ;
        while (start >= 0 && s.charAt(start) == ' ') {
            start--;
        }
        while (s.charAt(start) != ' ') {
            start--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "luffy is still joybo";
        System.out.println(lengthOfLastWord(s));
    }
}
