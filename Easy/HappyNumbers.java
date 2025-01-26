package Easy;

import java.util.*;

public class HappyNumbers {

	public static boolean happynumber(int n) {
		Set<Integer> set = new HashSet<>();
		while (!set.contains(n)) {
			set.add(n);
			int sum = 0;
			while (n != 0) {
				sum = sum + ((n % 10) * (n % 10));
				n = n / 10;
			}
			if (sum == 1)
				return true;
			n = sum;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 192;
		System.out.println(happynumber(n));

	}

}
