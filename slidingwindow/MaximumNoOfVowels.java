package slidingwindow;

public class MaximumNoOfVowels {

	public static int vowels(String s,int k) {
		int l=0,r=0,count=0,max=0;
		
		while(r<k)
		{
			Character c=s.charAt(r);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
			r++;
		}
		
		max=Math.max(max, count);
		
		for( r=r;r<s.length();++r)
		{
			Character c=s.charAt(l);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count--;
			l++;
			c=s.charAt(r);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
			max=Math.max(max, count);
			
		}
		return max;
	}
	public static void main(String[] args) {
          String s="aeiou";
          int k=2;
          System.out.println(vowels(s,k));
          
	}

}
