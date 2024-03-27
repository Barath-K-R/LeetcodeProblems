package lists;



public class MiddleOfLnkedList {
	static ListNode root;
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public MiddleOfLnkedList(){
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
    
    
    public void print(ListNode t) {
    	ListNode t1=t;
    	while(t1!=null) {
    		System.out.print(t1.val+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
   
    public ListNode findmiddle() {
    	ListNode slow=root,fast=root;
    	
    	while(fast!=null && fast.next!=null)
    	{
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow;
    }
	public static void main(String []args) {
		MiddleOfLnkedList r=new MiddleOfLnkedList();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		r.insertatend(7);
		
		
		
		
		r.print(root);
		ListNode middle=r.findmiddle();
		
		r.print(middle);
		
		
	}

}
