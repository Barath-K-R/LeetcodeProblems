package stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString2 {
    public static String removeDuplicates(String s, int k) {
        Stack<String>st=new Stack<>(),count=new Stack<>();
        for(int i=0;i<s.length();++i){
            String currChar=s.substring(i, i+1);
            if(!st.isEmpty() && st.peek().equals(currChar)){
                 if(count.peek().equals(Integer.toString(k-1))){
                     for(int j=0;j<k-1;++j){
                         st.pop();
                         count.pop();
                     }
                 }
                 else{
                    st.push(currChar);
                    
                    count.push(Integer.toString(Integer.parseInt(count.peek())+1));
                 }

            }
            else{
                st.push(currChar);
                count.push("1");
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="pbbcggttciiippooaais";
        System.out.println(removeDuplicates(s, 2));
    }
}
