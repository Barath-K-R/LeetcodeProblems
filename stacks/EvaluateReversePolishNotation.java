package stacks;

import java.util.Stack;

/**
 * EvaluateReversePolishNotation
 */
public class EvaluateReversePolishNotation {
    
    public static int evalRPN(String[] tokens) {
       Stack<Integer>stack=new Stack();
       for(int i=0;i<tokens.length;++i){
        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(c.equals("-")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }
            else if(c.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else
            stack.push(Integer.parseInt(c));
        }
        
    }
    return stack.pop();
}
    

    public static void main(String[] args) {
        String[]tokens={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}