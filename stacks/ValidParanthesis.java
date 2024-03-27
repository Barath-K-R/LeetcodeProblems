package stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
    	if(s.length()%2!=0)
    		return false;
        Stack<Character> st = new Stack<Character>();
        for(char c:s.toCharArray())
        {
        	if(!st.isEmpty() && c==')' && st.peek()=='(')
        		st.pop();
        	else if(!st.isEmpty() && c=='}' && st.peek()=='{')
        		st.pop();
        	else if(!st.isEmpty() && c==']' && st.peek()=='[')
        		st.pop();
        	else
        		st.push(c);
        	
        }
        if (!st.isEmpty())
            return false;
        else
            return true;

    }

    public static void main(String[] args) {
        String s = "{}()}}";
        System.out.println(isValid(s));
    }
}
