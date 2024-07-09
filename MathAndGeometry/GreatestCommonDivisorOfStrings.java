package MathAndGeometry;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        String smallString=str1.length()<str2.length()?str1:str2;
        StringBuilder sb1=new StringBuilder(),sb2=new StringBuilder();
        for(int i=smallString.length()-1;i>=0;--i){
            String substring=smallString.substring(0, i+1);
             if(str1.length()%substring.length()!=0 || str2.length()%substring.length()!=0)
             continue;
             int len1=str1.length()/substring.length(),len2=str2.length()/substring.length();
             for(int j=0;j<len1;++j)
             sb1.append(substring);
             for(int l=0;l<len2;++l)
             sb2.append(substring);
             if(sb1.toString().equals(str1) && sb2.toString().equals(str2))
             return substring;
        }
        return "";
    }
    public static void main(String[] args) {
        String str1="LEET",str2="CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
