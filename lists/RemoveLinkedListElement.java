package lists;



public class RemoveLinkedListElement {

	static ListNode root;
	static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value){
			this.value=value;
			this.next=null;
		}
		
	}
	
	public RemoveLinkedListElement(){
		this.root=null;
		
	}

	
     public boolean insertatend(int item) {
    	
    	 ListNode n=new ListNode(item),t1=root ;
    	if(root==null)
    	{
    		root=n;
    		return true;
    	}
    	while(t1.next!=null) {
    		t1=t1.next;
    	} 
    	t1.next=n;
    	return true;
    }
    
    
    public void print() {
    	ListNode t1=root;
    	while(t1!=null) {
    		System.out.print(t1.value+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
   
    public void removeelement(int num) {
    	ListNode curr=root,prev=null;
    	
    	while(curr!=null)
    	{
    		if(curr.value==num)
    		{
    			if(prev==null)
    			{
    				root=curr.next;
    				curr=curr.next;
    				continue;
    			}
    			prev.next=curr.next;
    			curr=curr.next;
    			continue;
    			
    		}
    		prev=curr;
    		curr=curr.next;
    	}
    	
    }
	public static void main(String []args) {
		RemoveLinkedListElement r=new RemoveLinkedListElement();
	    
		r.insertatend(7);
		r.insertatend(7);
		r.insertatend(7);
		r.insertatend(7);
		
		r.print();
		r.removeelement(7);
		
		r.print();
		
		
	}

}
