package MathAndGeometry;

public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;--i){
            String temp=num.substring(i,i+1);
            if(Integer.parseInt(temp)%2!=0)
            return num.substring(0,i+1);
        }
        return "";
    }
    public static void main(String[] args) {
        String num="246802";
        System.out.println(largestOddNumber(num));
    }
}
