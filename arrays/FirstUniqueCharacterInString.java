package arrays;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();++i){
            if(map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
            map.put(s.charAt(i),1);
        }
        for(int j=0;j<s.length();++j){
            if(map.get(s.charAt(j))==1)
            return j;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(firstUniqChar(s));
    }
}
