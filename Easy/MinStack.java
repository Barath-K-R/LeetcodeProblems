package Easy;

import java.util.*;

public class MinStack {
	static int topm=-1,min=0,topa=-1;
    static int[]m=new int[10],a=new int[10];;
    
    public static int min() {
    	return m[topm];
    }
	public static void push(int value) {
		a[++topa]=value;
		if(topm==-1 || (m[topm]>value))
		{
			m[++topm]=value;
		}
		else if(topm!=-1 && m[topm]<value)
		{
			int temp=m[topm];
			m[++topm]=temp;
		}
		
			
			
	}
	
	public static int pop() {
		if(topa!=-1)
		{
			topm--;
			
		   return a[topa--];
		}
		else 
			return -1;
	}
	
	public static int peek() {
		return a[topa];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(-2);
		push(4);
		push(0);
		push(-1);
		pop();
		
		
		
		System.out.println("min ="+min());
		
		
		

	}

}
