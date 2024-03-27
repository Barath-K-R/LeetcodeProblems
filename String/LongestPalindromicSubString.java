package String;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="babd";
		char[]c=s.toCharArray();
        String res="";
        int l=0,r=0;

        
        for(int i=0;i<s.length();++i)
        {
        	
            l=i-1;
            r=i+1;
            while(l>=0 && r<s.length() && (c[l]==c[r]))
            {
            	System.out.println("check");
            	if(s.substring(l,r).length()>res.length())
            	res=s.substring(l,r+1);
            	l--;
            	r++;
            }
            
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && (c[l]==c[r]))
            {
            	System.out.println("sasda");
            	if(s.substring(l,r).length()>res.length())
                	res=s.substring(l,r+1);
                	l--;
                	r++;
            }
        }
        System.out.println(res);
		

	}

}
