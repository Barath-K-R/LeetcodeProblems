package stacks;
import java.util.*;
public class GenerateParantheses {
   
    public static void parantheses(String brackets,int open,int close,List<String>res){
        if(open==0 && close==0){
            res.add(brackets);
            return;
        }
        if(open>0)
        parantheses(brackets+"(", open-1, close,res);
        if(close>0 && open<close)
        parantheses(brackets+")", open, close-1,res);
    }
    public static List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        parantheses("(", n-1, n,res);
        return res;
    }
    public static void main(String[] args) {
        int n=3;
        List<String>res=generateParenthesis(n);
        System.out.println(res);
        
        
    }

}
