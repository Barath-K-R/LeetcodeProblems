package stacks;

import java.util.Stack;

public class RemovingStarsFromString {
    public static String removeStars(String s) {
        String res="";
        Stack st=new Stack();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='*'){
                st.pop();
            }
            else
            st.push(s.charAt(i));
        }
       while(!st.isEmpty()){
           res=st.pop()+res;
       }
        return res;
    }
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }
}
