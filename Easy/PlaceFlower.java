package Easy;

public class PlaceFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,0};
		int count=0;;
	for(int i=0;i<a.length;++i)
	{
		if(a[i]==1)
			continue;
		else if(a[i]==0 && (i-1>=0 && i+1<a.length) && a[i-1]==0 && a[i+1]==0)
		{
			a[i]=1;
		  count++;
		}
		else if(a[i]==0 && i>0 && (a[i-1]==1 || a[i+1]==1))
			continue;
		else
		{
			a[i]=1;
			count++;
		}
		
	}

	System.out.println(count);
	}

}
