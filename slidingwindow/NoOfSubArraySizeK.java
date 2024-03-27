package slidingwindow;

public class NoOfSubArraySizeK {

	public static void main(String[] args) {
		int[]arr= {11,13,17,23,29,31,7,5,2,3};
		int k=3,threshold=5,res=0,count=0,start=0,t=0,sum=0,avg=0;
		
		for(int i=0;i<arr.length;++i)
		{
			if(count<k)
				count++;
			else {
				sum=sum-arr[start];
				start++;
			}
			sum=sum+arr[i];
			if(count>=k)
			{
				
				avg=sum/count;
				System.out.println("avg="+avg);
				
				if(avg>=threshold)
					res++;
			}
			System.out.println(sum+" count="+count);
			t++;

	}
		 System.out.println(res);
}
}
