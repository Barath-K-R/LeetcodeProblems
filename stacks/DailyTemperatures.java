package stacks;
import java.util.*;
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>st=new Stack<>();
        int[]res=new int[temperatures.length];
        st.push(new int[]{temperatures[0],0});
        for(int i=1;i<temperatures.length;++i){
            while(!st.isEmpty() && temperatures[i]>st.peek()[0]){
                res[st.peek()[1]]=i-st.peek()[1];
                st.pop();
            }
            st.push(new int[]{temperatures[i],i});

        }
        return res;
    }
    public static void main(String[] args) {
        int[]tmeperatures={73,74,75,71,69,72,76,73};
        int[]res=dailyTemperatures(tmeperatures);
        for(int n:res)
        System.out.println(n);
    }
}
