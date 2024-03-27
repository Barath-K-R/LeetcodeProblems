package slidingwindow;

public class MinimumOperationToReduceToZero {
	public static int solution(String s)
	{
			int l=0,r=0,diff1=0,diff2=0,res=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
			int n=s.length();
			
			s=s+s;
			String alt1="",alt2="";
			for(int i=0;i<n;++i)
			{
				if(i%2==0)
				{
					alt1=alt1+"1";
					alt2=alt2+"0";
				}
				else
				{
					alt1=alt1+"0";
					alt2=alt2+"1";
				}
			}
			alt1=alt1+alt1;
			alt2=alt2+alt2;
			
			for(r=r;r<s.length();++r)
			{
				
				if(s.charAt(r)!=alt1.charAt(r))
					diff1++;
				if(s.charAt(r)!=alt2.charAt(r))
					diff2++;
				
				if(r-l+1>n)
				{
					if(s.charAt(l)!=alt1.charAt(l))
						diff1--;
					if(s.charAt(l)!=alt2.charAt(l))
						diff2--;
					l++;
				}
				if(r-l+1==n)
				{
					
					min=Math.min(diff1,diff2);
					res=Math.min(res,min);
					
				}
			}
			return res;
	}
	public static void main(String[] args) {
		
          String s="01001001101";
          System.out.println(solution(s));
        
	}
}
