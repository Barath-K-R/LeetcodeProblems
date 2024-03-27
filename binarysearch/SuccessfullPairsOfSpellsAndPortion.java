package binarysearch;

import java.util.Arrays;

public class SuccessfullPairsOfSpellsAndPortion {

	public static int[] solution(int[]spells,int[]potions,long success) {
		Arrays.sort(potions);
		int res=0,temp=0;
		int[]output=new int[spells.length];
		
		for(int i=0;i<spells.length;++i)
		{
			int l=0,r=potions.length-1,mid=0;
			res=-1;
			System.out.println("spells="+spells[i]);
			while(l<=r)
			{
				mid=(l+r)/2;
				System.out.println("mid="+mid+" "+(potions[mid]*spells[i]));
				if((potions[mid]*spells[i])>=success)
				{
					System.out.println("entered");
					r=mid-1;
					res=mid;
				}
				else if((potions[mid]*spells[i])<success)
					l=mid+1;
			}
			System.out.println("res="+res);
			if(res!=-1)
			res=potions.length-res;
			else
				res=0;
			output[temp++]=res;
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[]spells= {15,8,19},potions= {38,36,23};
          long success=328;
          for(int n:solution(spells,potions,success))
          {
        	  System.out.println(n);
          }
	}

}
