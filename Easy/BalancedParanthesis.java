package Easy;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack <Character>st=new Stack<Character>();
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();++i)
		{
			if(s.charAt(i)==')' && st.peek()=='(')
				st.pop();
			else if(s.charAt(i)=='}' && st.peek()=='{')
				st.pop();
			else if(s.charAt(i)==']' && st.peek()=='[')
				st.pop();
			else 
				st.push(s.charAt(i));
		}
		
		if(!st.isEmpty())
			System.out.println("false");
		else
			System.out.println("true");

	}

}
