package Easy;



public class ReverseLinkedList {
	  class Node{
		   private int value;
		   private Node link;
	   }
	  
	  private Node head=null;
		
	    public ReverseLinkedList(int item) {
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
	    
	    public void reverselist(){
	    	Node p1=head,p2=null;
	    	while(p1!=null)
	    	{
	    		
	    		Node temp=p1.link;
	    		
	    		p1.link=p2;
	    		p2=p1;
	    		p1=temp;
	    	}
	    	head=p2;
	    	
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
		ReverseLinkedList r=new ReverseLinkedList(2);
		r.insertatend(3);
		r.insertatend(8);
		r.insertatend(9);
		r.insertatend(4);
		
		
		
		r.reverselist();
		
		r.printlist();
		
		
		

	}

}
