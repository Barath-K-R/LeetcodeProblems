package twopointers;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
       int greed=0,cookie=0,count=0;
       Arrays.sort(g);
       Arrays.sort(s);
       while(greed<g.length && cookie<s.length){
            //satisfied
            if(g[greed]<=s[cookie]){
                count++;
                greed++;
                cookie++;
            }
            //not satisfied
            else{
                cookie++;
            }
       }
       return count;
    }
    public static void main(String[] args) {
        int[]g={10,9,8,7},s={5,6,7,8};
        System.out.println(findContentChildren(g, s));
    }
}
