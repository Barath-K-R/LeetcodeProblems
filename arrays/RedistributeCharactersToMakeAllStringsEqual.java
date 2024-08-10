package arrays;

import java.util.*;
import java.util.Map.Entry;



public class RedistributeCharactersToMakeAllStringsEqual {
    public static boolean makeEqual(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;++i){
            for(int j=0;j<words[i].length();++j){
                if(map.containsKey(words[i].charAt(j)))
                map.put(words[i].charAt(j),map.get(words[i].charAt(j))+1);
                else
                map.put(words[i].charAt(j),1);
            }
        }
        for(Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()%words.length!=0)
            return false;
        }
        System.out.println(map);
        return true;
    }
    public static void main(String[] args) {
        String []words={"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
}
