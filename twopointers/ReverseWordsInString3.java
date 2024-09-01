package twopointers;

public class ReverseWordsInString3 {
    public static String reverseWords(String s) {
        String res="";
        String[]words=s.split(" ");
        for(int i=0;i<words.length;++i){
            int l=0,r=words[i].length()-1;
            char[]c=words[i].toCharArray();
            while(l<r){
                char ch=c[l];
                c[l]=c[r];
                c[r]=ch;
                l++;
                r--;
            }
            String newString=new String(c);
            res+=newString+" ";
        }
        return res;
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
