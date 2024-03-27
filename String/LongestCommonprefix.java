package String;



public class LongestCommonprefix {

	public static String divide(String []s,int l,int r) {
		System.out.println("divide"+l+"="+r);
		if(l-r==1 || l-r==-1)
		{
			System.out.println(l+"="+r);
			commonsubstring(s,l,r);
			return s[l];
		}
		else if(l-r==0)
			return s[l];
		else
		{
			int mid=l+r/2;
			String cs1=divide(s,l,mid);
			String cs2=divide(s,mid+1,r);
			return check(cs1,cs2);
		}
	}
	public static String commonsubstring(String []s,int l,int r) {
		System.out.println("cmmsubs"+l+"="+r);
		int i=0,j=0;
        
		while(i<s[l].length() && j<s[r].length())
		{
			if(s[l].charAt(i)==s[r].charAt(j))
			{	
			i++;
			j++;
			}
			else
				break;
			System.out.println(i<s[l].length() && j<s[r].length());
			
		}
		
		return s[l].substring(0,i);
	}
	public static String check(String s1,String s2) {
		int i=0,j=0;
		while(i<s1.length() && j<s2.length() && (s1.charAt(i)==s2.charAt(j)))
		{
			i++;
			j++;
		}
		return s1.substring(0,i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String []s= {"apple","ape","april"};
       String res=divide(s,0,s.length-1);
       System.out.println(res);
       Tree.WordSearchUsingTrie w=new Tree.WordSearchUsingTrie();
	}

}
