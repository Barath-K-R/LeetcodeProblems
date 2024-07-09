package MathAndGeometry;

public class CountOddNumbersInRange {
    public static int countOdds(int low, int high) {
        int length=high-low+1;
        if(length%2==0)
        return length/2;
        else{
            if(low%2!=0)
            return length/2+1;
            else
            return length/2;
        }
    }
    public static void main(String[] args) {
        int low=0,high=10;
        System.out.println(countOdds(low, high));
    }
}
