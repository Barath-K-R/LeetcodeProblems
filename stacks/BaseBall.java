package stacks;

import java.util.*;

public class BaseBall {

	public static int solution(String []operations) {
		 int sum=0,top=0;
	        Stack<String>st=new Stack<String>();
	        
	        for(int i=0;i<operations.length;++i)
	        {
	            System.out.println(operations[i]);
	             if(operations[i].contains("C"))
	             {
	                  top=Integer.parseInt(st.pop());
	                 sum=sum-top;
	             }
	             else if(operations[i].contains("D"))
	             {
	                 top=Integer.parseInt(st.peek());
	                 st.push(Integer.toString(top*2));
	                 sum=sum+(top*2);
	             }
	             else if(operations[i].contains("+")){
	                 top=Integer.parseInt(st.pop());
	                 int tempsum=Integer.parseInt(st.peek())+top;
	                 st.push(Integer.toString(top));
	                 st.push(Integer.toString(tempsum));
	                 sum=sum+tempsum;
	             }
	             else{
	                sum=sum+Integer.parseInt(operations[i]);
	                st.push(operations[i]);
	             }
	             System.out.println(st+" sum="+sum);
	        }
	        return sum;
	}
	public static void main(String[] args) {
		String []operations= {"36","28","70","65","C","+","33","-46","84","C"};
		System.out.println(solution(operations));
	}

}
