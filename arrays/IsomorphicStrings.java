package arrays;

import java.util.HashMap;

public class IsomorphicStrings {

     public static boolean isIsomorphic(String s, String t) {
    	 HashMap<Character, Character>map1=new HashMap<Character, Character>(),map2=new HashMap<Character, Character>();
    	 for(int i=0;i<s.length();++i) {
    		 if(map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i))!=t.charAt(i))
    			 return false;
    		 else if(map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i))!=s.charAt(i)) {
    			 return false;
    		 }
    		 else {
    			 map1.put(s.charAt(i), t.charAt(i));
    			 map2.put(t.charAt(i), s.charAt(i));
    		 }
    	 }
         return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="egg",t="add";
         System.out.println(isIsomorphic(s, t));
         
	}

}
