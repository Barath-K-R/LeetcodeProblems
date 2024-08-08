package arrays;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
    public static int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer>map=new HashMap<>(),temp=new HashMap<>();
        int k=0,res=0;
        for(int i=0;i<chars.length();++i){
            if(map.containsKey(chars.charAt(i)))
                map.put(chars.charAt(i),map.get(chars.charAt(i))+1);
            else
            map.put(chars.charAt(i), 1);
        }
        System.out.println(map);
        for(int j=0;j<words.length;++j){
            for(k=0;k<words[j].length();++k){
                System.out.println("k="+k);
                if(temp.containsKey(words[j].charAt(k)))
                temp.put(words[j].charAt(k),temp.get(words[j].charAt(k))+1);
                else
                temp.put(words[j].charAt(k),1);
                if(!map.containsKey(words[j].charAt(k)) || temp.get(words[j].charAt(k))>map.get(words[j].charAt(k)))
                break;
                System.out.println("breaking");
            }
            if(k>=words[j].length())
            res+=words[j].length();
            temp.clear();
        }
        
        return res;
    }
    public static void main(String[] args) {
        String[]words={"hello","world","leetcode"};
        String chars="welldonehoneyr";
        System.out.println(countCharacters(words, chars));
    }
}
