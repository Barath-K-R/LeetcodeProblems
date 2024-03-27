package Easy;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {0,1,2,2,3,0,4,2};
		int value=2;
		int i=0,j=a.length-1,count=0;
		
		while(i<j)
		{
			while(a[i]!=value)
			{
				count++;
				i++;
			}
			while(a[j]==value) {
				a[j]=0;
				--j;
			}
			System.out.println(i+" "+j);
			a[i]=a[j];
			++i;
			--j;
			count++;
			System.out.println("count="+count);
			
		}
		if(a[i]!=value)
			count++;
		
		for(int n:a)
			System.out.println(n);
		System.out.println("count="+count);

	}

}
