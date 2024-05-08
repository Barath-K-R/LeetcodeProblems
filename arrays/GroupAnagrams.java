package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>>res=new ArrayList<>();
    	HashMap<HashMap<Character, Integer>,List<String>>outermap=new HashMap<>();
        for(int i=0;i<strs.length;++i) {
        	HashMap<Character,Integer>internalMap=new HashMap<Character, Integer>();
        	
        	for(int j=0;j<strs[i].length();++j) {
        		char c=strs[i].charAt(j);
        		if(internalMap.containsKey(c)) {
        			internalMap.put(c,internalMap.get(c)+1 );
        		}
        		else {
					internalMap.put(c, 1);
				}
        	}
        	if(outermap.containsKey(internalMap)) {
        		outermap.get(internalMap).add(strs[i]);
        	}
        	else {
        		outermap.put(internalMap, new ArrayList<String>());
        		outermap.get(internalMap).add(strs[i]);
        	}
        	
        }
        for(Map.Entry<HashMap<Character, Integer>, List<String>>entry:outermap.entrySet()) {
        	res.add(entry.getValue());
        }

        return res;
    }
	public static void main(String[] args) {
		String[]strs= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>>res=groupAnagrams(strs);
		System.out.println(res);
	}

}
