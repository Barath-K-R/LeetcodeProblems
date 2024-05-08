package arrays;

import java.net.CookieHandler;
import java.util.HashSet;

public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
    	int count=0;
    	HashSet<String>uniqueEmailSet=new HashSet<String>();
    	for(int i=0;i<emails.length;++i) {
    		String localname=emails[i].split("@")[0];
    		int j=0;
    		while(j<localname.length()) {
    			
    			if(localname.charAt(j)=='.')
    				localname=localname.substring(0,j)+localname.substring(j+1,localname.length());
    			else if(localname.charAt(j)=='+'){
    				localname=localname.substring(0,j);
    				break;
    			}
    			else {
					++j;
				}
    		}
    		String correctedEmail=localname+"@"+emails[i].split("@")[1];
    		
    		if(!uniqueEmailSet.contains(correctedEmail))
    			uniqueEmailSet.add(correctedEmail);
    	}
        return uniqueEmailSet.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[]emailStrings= {"a.............@b.com", "a++++++@b.com"};
        System.out.println(numUniqueEmails(emailStrings));
	}

}
