package stacks;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        int[]res=new int[asteroids.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;++i){
            if(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                if(st.peek()<asteroids[i])
                {
                    st.pop();
                    st.push(asteroids[i]);
                }
                else if(st.peek() == asteroids[i]){
                    st.pop();
                }
            }
            else
            st.push(asteroids[i]);
        }
        int count=0;
        while(!st.isEmpty()){
            res[count++]=st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[]res=asteroidCollision(asteroids);
        for(int n:res)
        System.out.println(n);
    }
}
