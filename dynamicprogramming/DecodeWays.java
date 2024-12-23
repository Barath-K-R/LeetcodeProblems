package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    public static int numDecodings(String s){
        Map<Integer,Integer>map=new HashMap<>();
       return dfs(0,s);

    }

    private static int dfs(int i, String s) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;

        int res = dfs(i + 1, s);
        if (i < s.length() - 1) {
            if (s.charAt(i) == '1' || 
               (s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                res += dfs(i + 2, s);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="111111111111111111111111111111111111111111111";
        System.out.println(numDecodings(s));
    }
}