package stacks;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        path=path+"/";
        for(int i=0;i<path.length();++i){
            System.out.println(path.charAt(i)+"   "+sb);
            if(path.charAt(i)=='/'){
                if(sb.toString().equals("..")){
                    System.out.println("double dot");
                     if(!st.isEmpty())
                     st.pop();
                }
                else if(!sb.toString().equals(".") && !sb.isEmpty())
                    st.push(sb.toString());
                sb.setLength(0);
            }
            else if(path.charAt(i)!='/'){
                sb.append(path.charAt(i));
            }
            
        }
        System.out.println(st);
        String res="";
        if(st.isEmpty())
        res=res+"/";
        while(!st.isEmpty()){
             res="/"+st.pop()+res;
        } 
        return res;
    }
    public static void main(String[] args) {
        String s="/.../a/b/../c/./";
        System.out.println(simplifyPath(s));
    }
}
