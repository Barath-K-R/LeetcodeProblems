package MathAndGeometry;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInteger {
    //my approach
    // public static int romanToInt(String s) {
    //     Map<Character, Integer> map = new HashMap<>();
    //     int sum = 0;
    //     Stack<Character>st=new Stack<>();
    //     map.put('I', 1);
    //     map.put('V', 5);
    //     map.put('X', 10);
    //     map.put('L', 50);
    //     map.put('C', 100);
    //     map.put('D', 500);
    //     map.put('M', 1000);
    //     for(int i=0;i<=s.length();++i){
            
    //         //equal or lesser
    //        if(!st.isEmpty() && (i==s.length() || map.get(s.charAt(i))<=map.get(st.peek()))){
    //            int temp=map.get(st.pop());
    //            while(!st.isEmpty()){
    //                temp=temp-map.get(st.pop());
    //            }
    //            sum+=temp;
               
    //        }
    //        if(i<s.length())
    //        st.push(s.charAt(i));
    //        System.out.println("i="+i+" "+st);
    //     }
    //     return sum;
    // }


    //MORE OPTIMIZED APPROACH
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int sum = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=0;i<s.length();++i){
            if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                sum-=map.get(s.charAt(i));
            }
            else{
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
