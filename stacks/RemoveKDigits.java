package stacks;

import java.util.Currency;
import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int popCount = 0;
        for (int i = 0; i < num.length(); ++i) {
            int currNum = Character.getNumericValue(num.charAt(i));
            if (!st.isEmpty() && Character.getNumericValue(st.peek()) > currNum) {
                while (!st.isEmpty() && Character.getNumericValue(st.peek()) > currNum && popCount < k) {

                    st.pop();
                    popCount++;
                }
                if (st.isEmpty() && currNum == 0)
                    continue;
                st.push(num.charAt(i));
            } else {
                if (currNum == 0 && st.isEmpty())
                    continue;

                st.push(num.charAt(i));
            }

        }
        while(!st.isEmpty() && popCount<k){
            st.pop();
            popCount++;
        }
        // converting stack to string
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        if (sb.isEmpty())
            return "0";
        else
            return sb.toString();

    }

    public static void main(String[] args) {
        String num = "9";
        System.out.println(removeKdigits(num, 1));
    }
}
