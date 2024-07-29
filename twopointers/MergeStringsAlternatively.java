package twopointers;
public class MergeStringsAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        String res = "";
        int length = Math.max(word1.length(), word2.length());
        for (int i = 0; i < length; ++i) {
            if (i < word1.length())
                res = res + word1.charAt(i);
            if (i < word2.length())
                res = res + word2.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
}
