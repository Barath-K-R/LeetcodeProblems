import java.util.HashMap;
import java.util.Map;

/**
 * practise
 */
public class practise {

    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>(),temp=new HashMap<>();
        String s="cbaebabacd",p="abc";
        int[]
        for(int i=0;i<p.length();++i){
            if(map.containsKey(p.charAt(i)))
            map.put(p.charAt(i),map.get(p.charAt(i))+1);
            else
            map.put(p.charAt(i),1);
        }
       
        System.out.println(map);
    }
}