package matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int t=0,b=3,l=0,r=4,count=0,row=0,col=0;
		
		while(count<20)
		{
			if(count>=20)
				break;
			while(col<=r)
			{
				
				System.out.println(a[row][col]+" ");
				count++;
				col++;
			}
			col--;
			t++;
			
			while(row<=b)
			{
				
				System.out.println(a[row][col]+" ");
				count++;
				row++;
			}
			row--;
			r--;
			
			while(col>=l)
			{
				System.out.print(a[row][col]+" ");
				count++;
				col--;
			}
			col++;
			b--;
			
			while(row>=t)
			{
				System.out.print(a[row][col]+" ");
				row--;
				count++;
			}
			row++;
			l++;
		}
		

	}

}
