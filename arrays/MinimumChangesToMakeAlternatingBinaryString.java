package arrays;

public class MinimumChangesToMakeAlternatingBinaryString {
    public static int minOperations(String s){
        int count1=0,count2=0;
         for(int i=0;i<s.length();++i){
            if(i%2==0){
                 if(s.charAt(i)=='0')
                 count2++;
                 else
                 count1++;
            }
            if(i%2!=0){
                if(s.charAt(i)=='0')
                count1++;
                else
                count2++;
            }
         }
         return Math.min(count1,count2);
    }
    public static void main(String[] args) {
        String s="00011";
        System.out.println(minOperations(s));
    }
}
