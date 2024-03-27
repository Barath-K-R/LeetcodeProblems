package dynamicprogramming;

public class ClimbingStairs {

	public static int climbStairs(int n) {
		int[] res = new int[n+1];
		res[n] = res[n - 1] = 1;
		for (int i = n - 2; i >= 0; --i) {
			res[i] = res[i + 1] + res[i + 2];
		}
		return res[0];
	}

	public static void main(String[] args) {
		int n = 1;
		System.out.println(climbStairs(n));
	}

}
