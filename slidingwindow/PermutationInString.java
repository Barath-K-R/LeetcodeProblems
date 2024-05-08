package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static boolean check(String s1,String s2) {
		HashMap<Character,Integer>map1=new HashMap<Character, Integer>(),map2=new HashMap<Character, Integer>();
		if(s1.length()>s2.length())
			return false;
		for(int i=0;i<s1.length();++i)
		{
			if(map1.containsKey(s1.charAt(i)))
			map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
			else 
			map1.put(s1.charAt(i), 1);
			
			if(map2.containsKey(s2.charAt(i)))
				map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
			else {
				map2.put(s2.charAt(i), 1);
			}
			
		}
		System.out.println(map1+" "+map2);
		int left=0,right=s1.length()-1,temp=0;
		while(right!=s2.length()-1 && !map1.equals(map2)) {
			System.out.println("starting "+left+" "+right);
			if(map2.get(s2.charAt(left))-1<=0)
				map2.remove(s2.charAt(left));
			else {
				map2.put(s2.charAt(left),map2.get(s2.charAt(left))-1);
			}
			left=left+1;
			right=right+1;
			if(map2.containsKey(s2.charAt(right)))
				map2.put(s2.charAt(right),map2.get(s2.charAt(right))+1);
			else {
				map2.put(s2.charAt(right),1);
			}
			System.out.println("ending "+left+" "+right);
			System.out.println(map1+" "+map2);
//			temp++;
//			if(temp==4)
//				break;
		}
		if(map1.equals(map2))
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab",s2="a";
		System.out.println(check(s1,s2));
	}

}
