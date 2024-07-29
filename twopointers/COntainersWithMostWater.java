package twopointers;


public class COntainersWithMostWater {

	public static int solution(int[] height) {
		int l = 0, r = height.length - 1, max = 0;
		while (l < r) {
			int currmin = Math.min(height[l], height[r]);
			if (currmin * (r - l) > max)
				max = currmin * (r - l);
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return max;

	}

	public static void main(String[] args) {
		int[] height = { 1, 1 };
		System.out.println(solution(height));

	}

}
