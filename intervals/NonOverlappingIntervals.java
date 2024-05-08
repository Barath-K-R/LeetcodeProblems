package intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
    	ArrayList<int[]>ans=new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int t=0,count=0,temp=0;
        ans.add(intervals[0]);
        for(int[]n:ans)
        {
        	for(int a:n)
        		System.out.print(a);
        	System.out.println();
        }
        System.out.println("----------");
        for(int i=1;i<intervals.length;++i)
        {
        	System.out.println("temp="+temp+" "+ans.get(temp)[0]+" "+ans.get(temp)[1]);
        	if(intervals[i][0]<ans.get(temp)[1])
        	{
        		if(intervals[i][1]<=ans.get(temp)[1])
        		{
		    		System.out.println(intervals[i][0]+" "+intervals[i][1]+" less than equal");
		    		ans.remove(temp);
		    		ans.add(intervals[i]);
		    		count++;
        		}
        		else {
        			System.out.println(intervals[i][0]+" "+intervals[i][1]+" gretaer than");
            		count++;
            		continue;
        		}
        	}
        	else {
        		System.out.println(intervals[i][0]+" "+intervals[i][1]+" else");
        		ans.add(intervals[i]);
        		temp++;
        	}
        	for(int[]n:ans)
            {
            	for(int a:n)
            		System.out.print(a);
            	System.out.println();
            }
        	System.out.println("-------------");
        	
        }
        for(int[]n:ans)
        {
        	for(int a:n)
        		System.out.print(a);
        	System.out.println();
        }
        return count;
        	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] intervals = { {0,2},{1,3},{2,4},{3,5},{4,6} };
	        System.out.println(eraseOverlapIntervals(intervals));
	        
	}

}
