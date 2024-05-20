package arrays;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        String[]srr=s.split(" ");
        for(int i=0;i<pattern.length();++i){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(srr[i]))
                return false;
            }
            else if(!map.containsKey(pattern.charAt(i)) ){
                if(map2.containsKey(srr[i]) && !(map2.get(srr[i]).equals(pattern.charAt(i))))
                return false;
                map.put(pattern.charAt(i),srr[i]);
                map2.put(srr[i],pattern.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abbba",s="dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
