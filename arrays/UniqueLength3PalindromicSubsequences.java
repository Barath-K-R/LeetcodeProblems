package arrays;
import java.util.*;
public class UniqueLength3PalindromicSubsequences {
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer>right=new HashMap<>();
        Set<Character>left=new HashSet();
        Set<String>res=new HashSet<>();
        left.add(s.charAt(0));
        for(int j=1;j<s.length();++j){
            if(right.containsKey(s.charAt(j)))
            right.put(s.charAt(j),right.get(s.charAt(j))+1);
            else
            right.put(s.charAt(j),1);
        }
       
        for(int i=1;i<s.length();++i){
            
            if(right.get(s.charAt(i))==1){
                System.out.println(s.charAt(i)+"==="+"1");
                right.remove(s.charAt(i));
            }
            else
            right.put(s.charAt(i),right.get(s.charAt(i))-1);
            
            for(Map.Entry<Character,Integer>entry:right.entrySet()){
                if(left.contains(entry.getKey()))
                res.add(entry.getKey()+""+s.charAt(i)+entry.getKey());
            }
            
            left.add(s.charAt(i));
            
        }
        return res.size();
    }

    public static void main(String[] args) {
        String s="adc";
        System.out.println(countPalindromicSubsequence(s));
    }
}
