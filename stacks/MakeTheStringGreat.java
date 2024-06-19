package stacks;

import java.util.Stack;

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();++i){
            if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32){
                 st.pop();
            }
            else
            st.push(s.charAt(i));
        }

        //converting stack to string
        
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }
    public static void main(String[] args) {
        String s="leEeetcode";
        System.out.println(makeGood(s));
    }
}
