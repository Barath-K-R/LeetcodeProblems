package stacks;

import java.util.Stack;

public class LargestRectangleInAHistogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<int[]>stack=new Stack<>();
        int max=0;
        for(int i=0;i<heights.length;++i){
            if(!stack.isEmpty() && stack.peek()[1]>heights[i]){
                int lastindex=0;
                while(!stack.isEmpty() && stack.peek()[1]>heights[i]){
                    max=Math.max(stack.peek()[1]*(i-stack.peek()[0]),max);
                    lastindex=stack.pop()[0];
                }
                stack.push(new int[]{lastindex,heights[i]});
            }
            else
            stack.push(new int[]{i,heights[i]});
            
        }
        while(!stack.isEmpty()){
            int[]lastelement=stack.pop();
            max=Math.max(max,lastelement[1]*(heights.length-lastelement[0]));
        }
        return max;
    }
    public static void main(String[] args) {
        int[]heights={2,4};
        System.out.println(largestRectangleArea(heights));
    }
}
