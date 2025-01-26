package MathAndGeometry;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
        return "0";
        StringBuilder res=new StringBuilder();
        int len1=num1.length()-1,len2=num2.length()-1;
        for(int i=len2;i>=0;--i){
            int carry=0;
            for(int j=len1;j>=0;--j){
                System.out.println(i+" "+j);
                int place=(len2-i)+(len1-j);
                System.out.println("place="+place);
                int n1=Integer.parseInt(num2.substring(i, i+1));
                int n2=Integer.parseInt(num1.substring(j, j+1));
                int multilpliedValue=n1*n2;
                System.out.println("mul before ="+multilpliedValue);
                multilpliedValue+=carry;
                System.out.println("mul after "+carry+" ="+multilpliedValue);
                carry=0;
                if(res.length()>place && !res.substring(place,place+1).isEmpty()){
                    multilpliedValue+=Integer.parseInt(res.substring(place, place+1));
                    System.out.println("mul after place ="+multilpliedValue);
                }
                if(multilpliedValue>9){
                    carry=multilpliedValue/10;
                    multilpliedValue=multilpliedValue%10;
                }
                System.out.println("mulvalue final="+multilpliedValue);
                if(res.length()>place)
                res.setCharAt(place,(char)(multilpliedValue+'0'));
                else
                res.append(multilpliedValue);
                System.out.println("RES="+res);
            }
            if(carry!=0)
                res.append(carry);
                System.out.println("RES="+res);   
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) { 
        String num1="9133",num2="0";
        System.out.println(multiply(num1, num2));
    }
}