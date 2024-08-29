package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {
    public static int fibonaciiRecursion(int n,int[]dp,List<Integer>list){
        if(n<=1)
        return n;
        if(dp[n]!=-1)
        return dp[n];
        int sum=fibonaciiRecursion(n-1, dp,list)+fibonaciiRecursion(n-2, dp,list);
        dp[n]=sum;
        list.add(sum);
        return sum;
    }
    public static void main(String[] args) {
        int currsum=0,t1=0,t2=1;
        List<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(1);
        //iterative way for fibonacii series
        for(int i=0;i<9;++i){
            currsum=t1+t2;
            list.add(currsum);
            t1=t2;
            t2=currsum;
        }

        //recursive method
        List<Integer>res=new ArrayList<>();
        int n=6;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        fibonaciiRecursion(n, dp, res);
        System.out.println(res);
        
    }
}
