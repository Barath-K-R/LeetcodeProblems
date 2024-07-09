package MathAndGeometry;

public class CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int mondaymoney=1,totalmoney=0,temp=1;
        for(int i=1;i<=n;++i){
            totalmoney+=temp;
            temp++;
             if(i%7==0){
                mondaymoney+=1;
                temp=mondaymoney;
             }
        }
        return totalmoney;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(totalMoney(n));
    }
}
