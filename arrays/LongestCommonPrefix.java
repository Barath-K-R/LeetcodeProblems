package arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String commonprefix = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int j = 0;

            while (!(j >= strs[i].length() || j >= commonprefix.length())
                    && strs[i].charAt(j) == commonprefix.charAt(j))
                j++;
            commonprefix = commonprefix.substring(0, j);
        }
        return commonprefix;
    }

    public static void main(String[] args) {
        String[] strs = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs));
    }
}
