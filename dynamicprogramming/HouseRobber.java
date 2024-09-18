package dynamicprogramming;

public class HouseRobber {

    //using memoization  TC-----O(n) and SC------O(n)+O(n)
    //Without memoization TC----O(2^n) and SC-----O(2^n)
    public static int rob(int[] nums) {
        int[]dp=new int[nums.length];
        return dfs(nums.length-1,nums,dp);
    }
    public static int dfs(int index,int[]nums,int[]dp){
        if(index==0)
        return nums[0];
        if(index<0)
        return 0;
        if(dp[index]!=0)
        return dp[index];
        int pick=nums[index]+dfs(index-2,nums,dp);
        int unpick=dfs(index-1,nums,dp);
         
        dp[index]=Math.max(pick,unpick);
        return Math.max(pick,unpick);
    }

    //usig tabulation   TC----O(n) and SC----O(n)
   
    public static int tabulation1(int[]nums){   
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;++i){
            int pick=nums[i];
            if(i>1)
            pick+=dp[i-2];

            int unpick=0+dp[i-1];

            dp[i]=Math.max(pick,unpick);
        }
        return dp[nums.length-1];
    }

     //can also prev1 and prev2 and avoid dp array so that SC----O(1)
    public static int tabulation2(int[]nums){   
        
        int prev=nums[0];
        int prev2=0;
        
        for(int i=1;i<nums.length;++i){
            int pick=nums[i];
            if(i>1)
            pick+=prev2;

            int unpick=0+prev;

            prev2=prev;
            prev=Math.max(pick,unpick);
        }
        return prev;
    }
    public static void main(String[] args) {
        int[]nums={2,7,9,3,1};
        System.out.println(rob(nums));
        System.out.println(tabulation1(nums));
        System.out.println(tabulation2(nums));
    }
}
