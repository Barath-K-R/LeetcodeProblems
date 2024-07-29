package MathAndGeometry;

public class PowerOfFour {
	public static boolean isPowerOfFour(int n) {
        if(n==1)
        return true;

        if( n/4<=0 || n%4!=0)
        return false;

        if(isPowerOfFour(n/4))
        return true;
        else
        return false;
    }

	public static void main(String[] args) {
		int n=16;
		System.out.println(isPowerOfFour(n));

	}

}
