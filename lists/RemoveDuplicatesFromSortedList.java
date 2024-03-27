package lists;

import lists.RemoveLinkedListElement.ListNode;

public class RemoveDuplicatesFromSortedList {
	static ListNode root;
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public RemoveDuplicatesFromSortedList(){
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
    		System.out.print(t1.val+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
   
    public void removeduplicates() {
    	ListNode curr=root,prev=null;
    	int curvalue=Integer.MAX_VALUE;
    	while(curr!=null)
    	{
    		if(curr.val==curvalue)
    		{
    			System.out.println(curr.val+" matches");
    			if(prev==null)
    			{
    				root=curr.next;
    				curvalue=curr.val;
    				curr=curr.next;
    				continue;
    			}
    			prev.next=curr.next;
    			curr=curr.next;
    			continue;
    			
    		}
    		System.out.println(curr.val+" does not match");
    		prev=curr;
    		curvalue=curr.val;
    		curr=curr.next;
    		
    	}
    	
    }
	public static void main(String []args) {
		RemoveDuplicatesFromSortedList r=new RemoveDuplicatesFromSortedList();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(3);
		
		
		
		
		r.print();
		r.removeduplicates();
		
		r.print();
		
		
	}
}
