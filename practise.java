import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.lang.reflect.AccessibleObject;
/**
 * practise
 */
public class practise {

public static void main(String[] args) {
    String s1="123";
    String s2="567";
    StringBuilder res=new StringBuilder();
    for(int i=s2.length()-1;i>=0;i--){
        for(int j=s1.length()-1;j>=0;--j){
            StringBuilder carry=new StringBuilder(),tempres=new StringBuilder();
            int multiply=Integer.parseInt(s2.substring(i, i+1))*Integer.parseInt(s1.substring(j, j+1));
            carry.append(multiply);
            System.out.println("value"+((s2.length()-1)-i)+((s1.length()-1)-j));
            int start=(res.length()-1)-((s2.length()-1)-i)+((s1.length()-1)-j);

            System.out.println("multiply="+multiply);
            System.out.println("start="+start);
            for(int k=start;k>=0;k--){
                int sum = res.length() > 0 
    ? Integer.parseInt(res.substring(start, start + 1)) + Integer.parseInt(carry.toString())
    : Integer.parseInt(carry.toString());
                System.out.println("sum="+sum);
                tempres.setLength(0);
                tempres.append(sum);
                if(tempres.length()>1){
                    carry.setLength(0);
                    carry.append(tempres.substring(0,1));
                    tempres.delete(0, 1);
                }
                else
                carry.setLength(0);

                if(!res.isEmpty())
                res.setCharAt(start, tempres.charAt(0));
                else
                res.append(tempres);
            }
            if(!carry.isEmpty())
            res.insert(0,carry);
            System.out.println("res="+res);
        }
    }
    System.out.println(res);
}
}