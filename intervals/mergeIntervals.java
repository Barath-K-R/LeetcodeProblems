package intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]>ans=new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int temp=0;
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;++i)
        {
        	if(intervals[i][0]<ans.get(temp)[1])
        	{
        		ans.get(temp)[1]=Math.max(ans.get(temp)[1],intervals[i][1]);
        	}
        	else {
        		ans.add(intervals[i]);
        		temp++;
        	}
        }
        int[][]res=new int[ans.size()][2];
        ans.toArray(res);
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 9},{9,11},{8,10},{2,4},{15,18},{16,17} };
        int [][]res=merge(intervals);
        for(int[]n:res)
        {
        	for(int a:n)
        	System.out.print(a);
        	System.out.println();
        }
    }
}
