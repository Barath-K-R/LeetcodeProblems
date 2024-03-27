package Easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {4,5,6};
		int []a= {1,2,3,0,0,0};
		
		int p1=b.length-1,p2=b.length-1,p3=a.length-1;
		while(p1>=0 && p2>=0)
		{
			if(a[p1]>b[p2])
			{
				System.out.println(a[p1]+">"+b[p2]);
				a[p3]=a[p1];
				p1--;
			}
			else if(a[p1]<b[p2])
			{
				System.out.println(a[p1]+"<"+b[p2]);
				a[p3]=b[p2];
				p2--;
			}
			p3--;
		}
		
		while(p2>0)
		{
			a[p3]=b[p2];
			p3--;
			p2--;
		}
		for(int res:a)
			System.out.println(res);
		
		
		
		
		

	}

}
