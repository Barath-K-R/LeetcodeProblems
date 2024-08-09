package arrays;

public class MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {
        int []score=new int[s.length()];
        int count=0,res=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='0')
            count++;
            score[i]=count;
        }
        for(int n:score)
        System.out.println(n);
        count=0;
        for(int j=s.length()-1;j>0;--j){
            if(s.charAt(j)=='1')
            count++;
            else 
            score[j]--;
            res=Math.max(count+score[j],res);
        }
        
        return res;
    }
    public static void main(String[] args) {
        String s="1111";
        
        System.out.println(maxScore(s));
    }
}
