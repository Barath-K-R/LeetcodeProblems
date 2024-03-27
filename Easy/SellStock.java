package Easy;

public class SellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a= {7,6,4,3,1};
        int b=0,s=1,max=0;
        while(s<a.length)
        {
        	System.out.println("s="+a[s]);
        	if(a[s]-a[b]<0)
        	{
        		System.out.println("less than zero");
        		b++;
        		s++;
        	}
        	else if(a[s]-a[b]<max) {
        		System.out.println("less than max");
        		s++;
        	}
        	else if(a[s]-a[b]>max) {
        		System.out.println("greater than max");
        		max=a[s]-a[b];
        		s++;	
        	}
        	else
        	s++;
        }
        System.out.println(max);
	}

}
