package stacks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		int []a= {13,7,6,12};
		int i=0;
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		for(i=0;i<a.length;++i)
		{
			if(s.isEmpty())
			{
				System.out.println("p[ush"+a[i]);
				s.push(a[i]);
				
				continue;
			}
			if(s.peek()>a[i])
			{
				System.out.println(s.peek()+" push "+a[i]);
				s.push(a[i]);
				
			  
			}
			else
			{
				while(!s.isEmpty())
				{
					System.out.println(s.peek()+" pop "+a[i]);
					Iterator it=s.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					h.put(s.pop(),a[i]);
					
					
				}
				s.push(a[i]);
				Iterator it=s.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}
		}
		while(!s.isEmpty()) {
			h.put(s.pop(), -1);
		}
		
		for(Entry<Integer, Integer> entry:h.entrySet())
		{
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
		
		

	}

}
