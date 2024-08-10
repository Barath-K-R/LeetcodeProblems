package arrays;

import java.util.HashMap;

public class LargestSubstringsBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int count=-1;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();++i){
            if(!map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),i);
            else{
                count=Math.max(count,i-map.get(s.charAt(i))-1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="cbzxy";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
