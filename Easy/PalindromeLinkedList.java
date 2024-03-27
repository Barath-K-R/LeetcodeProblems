package Easy;



public class PalindromeLinkedList {
	class Node{
		   private int value;
		   private Node link;
	   }
	  
	  private static Node head=null;
		
	    public PalindromeLinkedList(int item) {
	    	head=new Node();
	    	head.value=item;
	    	head.link=null;
	    }

		public boolean insertatbeginning(int item) {
	    	Node n=new Node();
	    	n.value=item;
	    	
	    	n.link=head;
	    	head=n;
	    	return true;
	    }
	    
	    public boolean insertatend(int item) {
	    	Node n=new Node(),t1=head ;
	    	n.value=item;
	    	while(t1.link!=null) {
	    		t1=t1.link;
	    	} 
	    	t1.link=n;
	    	return true;
	    }
	    
	    public boolean insertatmiddle(int item,int position) {
	    	Node n=new Node(),a=head;
	    	n.value=item;
	    	for(int i=0;i<position-2;++i)
	    	{
	    		a=a.link;
	    	}
	    	n.link=a.link;
	    	a.link=n;
	    	return true;
	    	
	    }
	    
	    public boolean checkpalindrome() {
	    	Node start=PalindromeLinkedList.head,end=PalindromeLinkedList.head,middle=PalindromeLinkedList.head;
	    	
	    	//traversing the two pointer to middle and at end
	    	while(end!=null && end.link!=null) {
	    		end=end.link.link;
	    		middle=middle.link;
	    	}
	    	
	    	
	    	Node center=middle;
	    	//reversing the right half of the linked list
	    	Node prev=null;
	    	
	    	do
	    	{
	    		
	    		Node temp=middle.link;
	    		middle.link=prev;
	    		prev=middle;
	    		
	    		middle=temp;
	    		
	    		
	    	}while(middle!=null);
	    	
	    	
	    	//checking for palindrome
	    	Node left=start,right=prev;
	    	while(left.value!=center.value) {
	    		if(left.value!=right.value)
	    			return false;
	    		left=left.link;
	    		right=right.link;
	    		
	    	}
	    	return true;
	    }
	    
	    
	    public void printlist() {
	    	Node z=head;
	    	
	    	while(z!=null) {
	    		System.out.println(z.value);
	    		z=z.link;
	    	}
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeLinkedList r=new PalindromeLinkedList(5);
		r.insertatbeginning(7);
		r.insertatbeginning(6);
		r.insertatbeginning(8);
		r.insertatbeginning(9);
		r.insertatbeginning(8);
		r.insertatbeginning(6);
		r.insertatbeginning(7);
		r.insertatbeginning(5);
		
		System.out.println(r.checkpalindrome());
		
		

	}

}
