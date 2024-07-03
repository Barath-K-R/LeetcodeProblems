package stacks;

import java.util.Stack;

public class DecodeStrings {
    public static String decodeString(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            StringBuilder sb = new StringBuilder(), temp = new StringBuilder();
            if (s.charAt(i) == ']') {
                while (!st.peek().equals("[")) {
                    temp.insert(0, st.pop());
                }
                st.pop();
                String count="";
                while(!st.isEmpty() && st.peek().matches("\\d+")){
                     count=st.pop()+count;
                }
                for (int j = 0; j < Integer.parseInt(count); ++j)
                    sb.append(temp);
                st.push(sb.toString());
                temp.setLength(0);
                sb.setLength(0);
            } else {
                st.push(s.substring(i, i + 1));
            }
        }
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "12[b]";
        System.out.println(decodeString(s)); // Should output: "bb"
    }
}