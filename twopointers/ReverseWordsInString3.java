package twopointers;

public class ReverseWordsInString3 {
    public static String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String[]str=s.split(" ");
        for(int i=0;i<str.length;++i){
            char[]ch=str[i].toCharArray();
            int l=0,r=ch.length-1;
            while(l<r){
                char c=ch[l];
                ch[l]=ch[r];
                ch[r]=c;
                l++;
                r--;
            }
            res.append(ch);
            if(i!=str.length-1)
            res.append(" ");
        }   
        System.out.println(res);
        return res.toString();
    }
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
