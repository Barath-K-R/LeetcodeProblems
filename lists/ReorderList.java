package lists;



public class ReorderList {

	static ListNode root;
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public ReorderList(){
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
    
   public void reorder() {
	   ListNode slow=root,fast=root,first=root,last=null,t1=null,t2=null;
	   while(fast!=null && fast.next!=null)
	   {
		   fast=fast.next.next;
		   t1=slow;
		   slow=slow.next;
	   }
	   
	   ListNode curr=slow,prev=null,temp=null;
	   while(curr!=null)
	   {
		   temp=curr.next;
		   curr.next=prev;
		   
		   prev=curr;
		   curr=temp;
	   }
	   
	   
	   
	   last=prev;
	   
	   while(last.next!=null && first!=last) {
		  
		   t1=first.next;
		   t2=last.next;
		   
		   
		   first.next=last;
		   last.next=t1;
		   
		   first=t1;
		   last=t2;
		   
	   }
	   
	   
	   
   }
	public static void main(String []args) {
		ReorderList r=new ReorderList();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		
		
		
		
		
		
		print(root);
		r.reorder();
		print(root);
		
		
		
		
	}
}
