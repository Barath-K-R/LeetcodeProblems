package lists;

import org.w3c.dom.Node;

import lists.MiddleOfLnkedList.ListNode;

public class RemoveNthNode {
	static ListNode head;
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	public RemoveNthNode(){
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
    
   
    public static ListNode removeNthNode(int n) {
    	ListNode t1=head,t2=head;
    	for(int i=0;i<n;++i)
    	t1=t1.next;
    	
    	while(t1!=null && t1.next!=null)
    	{
    		t1=t1.next;
    		t2=t2.next;
    	}
    	if(t1==null)
    	{
    		head=head.next;
    		return head;
    	}
    	t2.next=t2.next.next;
    	return head;
    }
	public static void main(String []args) {
		RemoveNthNode r=new RemoveNthNode();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		r.insertatend(7);
		
		r.print(head);
		
		r.print(removeNthNode(7));
		
		
	}
	
}
