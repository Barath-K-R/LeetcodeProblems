package Easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world"; 
		int i=s.length()-1,count=0;
		while(s.charAt(i)==' ')
			--i;
		while(s.charAt(i)!=' ')
		{
			count++;
			--i;
		}
		System.out.println(count);
			
		
			

	}

}
