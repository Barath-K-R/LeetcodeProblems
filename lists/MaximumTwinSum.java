package lists;

import lists.ReorderList.ListNode;

public class MaximumTwinSum {

	static ListNode root;
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public MaximumTwinSum(){
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
    
    
    public static void print(ListNode t) {
    	ListNode t1=t;
    	while(t1!=null) {
    		System.out.print(t1.val+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
   public int twinsum() {
	   
	   ListNode fast=root,slow=root,prev=null;
	   int max=0;
	  
	   //finding middle
	   while(fast!=null && fast.next!=null)
	   {
		   fast=fast.next.next;
		   slow=slow.next;
	   }
	   System.out.println(slow.val);
	   //reverse
	   while(slow!=null)
	   {
		   ListNode temp=slow.next;
		   slow.next=prev;
		   prev=slow;
		   slow=temp;
	   }
	   
	   ListNode first=root,last=prev;
	   
	   while(last.next!=null && first!=last)
	   {
		   
		   if((first.val+last.val)>max)
		   max=first.val+last.val;
		   
		   first=first.next;
		   last=last.next;
		  
	   }
	   
	   return max;
	   
	}
	public static void main(String []args) {
		MaximumTwinSum r=new MaximumTwinSum();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		
		
		
		
		
		
		print(root);
		System.out.println("result is "+r.twinsum());
		
		
		
		
		
		
	}

}
