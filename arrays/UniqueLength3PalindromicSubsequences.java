package arrays;
import java.util.HashMap;
public class UniqueLength3PalindromicSubsequences {
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();++i){
            if(map.containsKey(s.charAt(i))){
                int tempcount=i-map.get(s.charAt(i))-1;
                if(tempcount>0)
                map.put(s.charAt(i),i);
                count+=tempcount;
            }
            else
            map.put(s.charAt(i),i);
        }
        return count;
    }

    public static void main(String[] args) {
        String s="uuuuu";
        System.out.println(countPalindromicSubsequence(s));
    }
}
