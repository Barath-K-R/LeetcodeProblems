package dynamicprogramming;

public class ClimbingStairs {

	//using tabulation
	public static int climbStairs(int n) {
		int[] res = new int[n+1];
		res[n] = res[n - 1] = 1;
		for (int i = n - 2; i >= 0; --i) {
			res[i] = res[i + 1] + res[i + 2];
		}
		return res[0];
	}

	//using memoization
	public static int dfs(int n){
		if(n<=1)
		return 1;
		return dfs(n-1)+dfs(n-2);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(climbStairs(n));
		System.out.println(dfs(n));
	}

}
