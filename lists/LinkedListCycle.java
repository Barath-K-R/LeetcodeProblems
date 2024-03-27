package lists;

import lists.MiddleOfLnkedList.ListNode;

public class LinkedListCycle {
	static ListNode head;
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	public LinkedListCycle(){
		this.head=null;
	}

	
     public boolean insertatend(int item) {
    	ListNode n=new ListNode(item),t1=head ;
    	if(head==null)
    	{
    		head=n;
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
    
   
    public static boolean detectCycle(ListNode head) {
    	ListNode fast=head,slow=head;
    	while(fast!=null && fast.next!=null)
    	{
    		fast=fast.next.next;
    		slow=slow.next;
    		if(fast==slow)
    			return true;
    	}
    	
    	return false;
    }
	public static void main(String []args) {
		LinkedListCycle r=new LinkedListCycle();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		r.insertatend(7);
		
		r.print(head);
		System.out.println(detectCycle(head));
		
		
		
	}

}
