package MathAndGeometry;

public class UglyNumber {

	public static boolean isUgly(int n) {
		int[] factors = { 2, 3, 5 };
		if (n<=0)
			return false;
		for (int i = 0; i < 3; ++i) {
			while (n % factors[i] == 0) 
				n = n / factors[i];
			if (n == 1)
					return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(isUgly(n));

	}

}
