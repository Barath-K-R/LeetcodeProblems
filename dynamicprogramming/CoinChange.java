
package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    
    //dynamic programming top-down approach
    public static int dfs(int[] coins, int amount,Map<Integer,Integer>dp) {
        System.out.println(amount);
         if(amount==0)
         return 0;
         if(dp.containsKey(amount))
         return dp.get(amount);

         int res=Integer.MAX_VALUE;
         System.out.println(res);
         for(int coin:coins){
            if(amount-coin>=0){
                int result=dfs(coins, amount-coin,dp);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }
        dp.put(amount,res);
        return res;
    }

    public static int 
    public static int coinChange(int[] coins, int amount) {
        Map<Integer,Integer>dp=new HashMap<>();
        int minCoins = dfs(coins, amount,dp);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }
    public static void main(String[] args) {
        int[]coins={2};
        int amount=3;
        System.out.println(coinChange(coins, amount));
    }
}