package MathAndGeometry;

public class PowOfXAndN {
    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        double res=1;
        for(int i=0;i<Math.abs(n);++i){
            res*=x;
        }
        return n>=0?res:1/res;
    }
    public static void main(String[] args) {
        double x=2.00000;
        int n=-2;
        System.out.println(myPow(x, n));
    }
}