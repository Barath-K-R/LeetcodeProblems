package stacks;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        int index=0;
        while(index<asteroids.length){
            if(st.isEmpty()){
                st.push(asteroids[index]);
                index++;
            }
            else if(st.peek()>0 && asteroids[index]<0){
                if(st.peek()<Math.abs(asteroids[index])){
                    System.out.println("smaller");
                    st.pop();
                }
                else if(st.peek()>Math.abs(asteroids[index])){
                    System.out.println("greater");
                    index++;
                }
                else{
                    System.out.println("equal");
                    st.pop();
                    index++;
                    System.out.println(st);
                }
            }
            else{
                st.push(asteroids[index]);
                index++;
            }
        }

        int[]res=new int[st.size()];
        int index2=st.size()-1;
        while(!st.isEmpty()){
              res[index2--]=st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {13,-10,8,-8};
        int[]res=asteroidCollision(asteroids);
        for(int n:res)
        System.out.println(n);
    }
}
