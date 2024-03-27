package Easy;

public class ReplaceElementsOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {17,18,5,4,6,1};
		int j=a.length-1,max=-1;
		
		while(j>=0) {
			
			if(max<a[j])
			{
				int temp=max;
				max=a[j];
				a[j]=temp;
			}
			a[j]=max;
			j--;
				
		}
		
		for(int res:a)
			System.out.println(res);

	}

}
