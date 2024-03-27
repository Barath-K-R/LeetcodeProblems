package Easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,p1=1,p2=1,count=0;
		
		for(int i=0;i<n-1;++i)
		{
			count=p1+p2;
			p2=p1;
			p1=count;
		}
		System.out.println(count);
		

	}

}
