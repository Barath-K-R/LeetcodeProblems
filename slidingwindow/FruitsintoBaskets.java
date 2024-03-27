package slidingwindow;

import java.util.HashMap;

public class FruitsintoBaskets {

	public static int solution(int []fruits) {
		int res=0,max=0;
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		int l=0,r=0;
		
		for(r=0;r<fruits.length;++r) {
			if(!h.containsKey(fruits[r]))
			h.put(fruits[r],1);
			else
				h.put(fruits[r], h.get(fruits[r])+1);
			
			if(h.size()>2)
			{
				while(h.size()>2)
				{
					h.put(fruits[l], h.get(fruits[l])-1);
					if(h.get(fruits[l])==0)
						h.remove(fruits[l]);
					l++;
				}
			}
			max=Math.max(max, r-l+1);
		}
		return max;
	}
	public static void main(String[] args) {
		int []a= {3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(solution(a));
		

	}

}
