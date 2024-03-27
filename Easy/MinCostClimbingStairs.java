package Easy;

public class MinCostClimbingStairs {
	public static void main(String[] args) {
		int []a= {1,100,1,1,1,100,1,1,100,1};
		int n=a.length,i=n-2,s1=0,s2=0,min=0;
		while(i>=0)
		{
			s1=a[i]+a[i+1];
			if(i+2>=n)
			s2=a[i]+0;
			else
				s2=a[i]+a[i+2];
			
			if(s1<s2)
				min=s1;
			else
				min=s2;
			a[i]=min;
			i--;
		}
		
		if(a[0]<a[1])
			System.out.println(a[0]);
		else
			System.out.println(a[1]);
	}


}
