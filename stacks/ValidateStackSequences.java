package stacks;

import java.util.Stack;

public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int l = 0, r = 0;
        Stack<Integer> st = new Stack<>();
        for (l = 0; l < pushed.length; ++l) {
            st.push(pushed[l]);
            while (!st.isEmpty() && r < popped.length && st.peek() == popped[r]) {
                st.pop();
                r++;
            }
        }
        for (r = r; r < popped.length; ++r) {
            if (!(st.peek() == popped[r]))
                return false;
            st.pop();
        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] pushed = { 2, 1, 0 }, popped = { 1, 2, 0 };
        System.out.println(validateStackSequences(pushed, popped));
    }
}
