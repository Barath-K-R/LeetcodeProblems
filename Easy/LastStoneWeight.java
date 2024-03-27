package Easy;

public class LastStoneWeight {

	public static void heapify(int []a,int i,int n) {
		int largest=i,leftchild=2*i+1,rightchild=2*i+2;
		
		if(leftchild>=n || rightchild>=n)
			return;
		System.out.println("leftchild="+a[leftchild]+" "+"rightchild="+a[rightchild]);
		if(leftchild<n && a[largest]<a[leftchild])
			largest=leftchild;
		if(rightchild<n && a[largest]<a[rightchild]) 
			largest=rightchild;
		
		System.out.println(a[largest]);
		if(i!=largest)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			
			System.out.println("heapify");
			for(int res:a)
				System.out.print(res+" ");
			System.out.println();
			heapify(a,largest,n);
		}
		
		
	}
	
	public static int laststone(int []a,int n){
		while(n>1)
		{
			System.out.println();
			System.out.println("loooooop");
			int firstlargest=0,secondlargest;
			System.out.println("a[1]="+a[1]+" a[2]="+a[2]);
			
			
			if(a[1]>a[2] || a[1]==a[2])
				secondlargest=1;
			else
				secondlargest=2;
			
			if(a[0]==a[secondlargest])
			{
				System.out.println("n value="+n);
				int count=0;
				while(count<=1)
				{
				    int temp=a[n-1];
				    System.out.println("n value="+n);
				    a[n-1]=a[count];
				    a[count]=temp;
				    n=n-1;
				    heapify(a,count,n);
				    count++;
				}
				return a[0];
				
			}
			
			int diff=a[firstlargest]-a[secondlargest];
			
			int temp=a[n-1];
			a[n-1]=a[secondlargest];
			a[secondlargest]=temp;
			n=n-1;
			System.out.println("secondlargest="+secondlargest+" a[]="+a[secondlargest]);
			heapify(a,secondlargest,n);
			
			a[firstlargest]=diff;
			
			System.out.println("a[fl]="+a[firstlargest]);
			System.out.println("root heapify");
			for(int res:a)
				System.out.print(res+" ");
			System.out.println();
			heapify(a,firstlargest,n);
			
			for(int res:a)
				System.out.print(res+" ");
			System.out.println();
			
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {89, 23, 100, 93, 82, 98, 91, 85, 33, 95, 72, 98, 63, 46, 17, 91, 92, 72, 77, 79, 99, 96, 55, 72, 24, 98, 79, 93, 88, 92};
			
		for(int i=(a.length-1)/2;i>=0;--i)
		{
			heapify(a,i,a.length);
		}
		for(int res:a)
			System.out.print(res+" ");
		System.out.println();
		System.out.println("final res="+laststone(a,a.length));

	}

}
