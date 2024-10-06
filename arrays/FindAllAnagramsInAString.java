package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        Map<Character,Integer>pcount=new HashMap<>(),scount=new HashMap<>();
        if(p.length()>s.length())
        return res;
        for(int i=0;i<p.length();++i){
            if(pcount.containsKey(p.charAt(i)))
            pcount.put(p.charAt(i),pcount.get(p.charAt(i))+1);
            else
            pcount.put(p.charAt(i),1);
        }
        int l=0,r=-1;
        while(r<p.length()-1){
            r++;
            if(scount.containsKey(s.charAt(r)))
            scount.put(s.charAt(r),scount.get(s.charAt(r))+1);
            else
            scount.put(s.charAt(r),1);
           
        }
        
        while(r<s.length()){
            if(pcount.equals(scount))
            res.add(l);
            
            if(scount.get(s.charAt(l))==1)
            scount.remove(s.charAt(l));
            else
            scount.put(s.charAt(l),scount.get(s.charAt(l))-1);
            l++;
            r++;
            
            if(r<s.length()){
                if(scount.containsKey(s.charAt(r)))
                    scount.put(s.charAt(r),scount.get(s.charAt(r))+1);
                else
                    scount.put(s.charAt(r),1);
            }
            
        }
       
        return res;
    }
    public static void main(String[] args) {
        String s="aaaaaaaaaa",p="aaaaaaaaaaaaa";
        List<Integer>res=findAnagrams(s, p);
        System.out.println(res);
    }
}
