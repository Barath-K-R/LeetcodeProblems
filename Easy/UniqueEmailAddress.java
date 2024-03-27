package Easy;



public class UniqueEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		for(int i=0;i<str.length;++i)
		{
			String s=str[i];
			int j=0,flag=0,plusindex = 0;
			while(s.charAt(j)!='@')
			{
				if(flag==1)
				{
					j++;
					continue;
				}
				
				if(s.charAt(j)=='.') {
					s=s.substring(0,j)+s.substring(j+1,s.length());
					continue;
				}
				else if(s.charAt(j)=='+') {
					flag=1;
					plusindex=j;
					j++;
					continue;
				}
				else
					j++;
			}
			if(flag==1)
			{
				s=s.substring(0,plusindex)+s.substring(plusindex+1,s.length());
			}
			
		}
		
		

	}

}
