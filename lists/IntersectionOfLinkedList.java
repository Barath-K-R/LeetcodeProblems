package lists;

import lists.MergeTwoSortedList.Listnode;

public class IntersectionOfLinkedList {
	static ListNode root1,root2;
	static class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
		
	}
	
	public IntersectionOfLinkedList(){
		this.root1=null;
		this.root2=null;
		
	}

	
     public boolean insertatend(ListNode root,int item,Character c) {
    	
    	 ListNode n=new ListNode(item),t1=root,t2=root2 ;
    	
    	if(c!='c' && root==null)
    	{
    		if(c=='a')
    			root1=n;
    		else if(c=='b')
    			root2=n;
    		
    		return true;
    	}
    	
    	while(t1!=null && t1.next!=null) {
    		
    		t1=t1.next;
    	} 
    	//adding intersection node
    	if(c=='c')
   	    {
   	       while(t2!=null && t2.next!=null)
   	       {
   	    	   
   	    	   t2=t2.next;
   	       }
   	       
   	       if(t1==null && t2!=null)
   	       {
   	    	   
   	         t1=n;
   	         t2.next=n;
   	       }
   	       else if(t2==null && t1!=null)
   	       {
   	    	   t2=n;
   	    	   t1.next=n;
   	       }
   	       else if(t1!=null && t2!=null)
   	       {
   	    	   
   	         t2.next=n;
   	          t1.next=n;
   	       }
   	       
   	       return true;
   	    }
    	
    	t1.next=n;
    	return true;
    }
    
    
    public void print(ListNode t1) {
    	
    	while(t1!=null) {
    		
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
    public ListNode Findintersection(ListNode headA,ListNode headB) {
    	
    	ListNode root1=headA,root2=headB;
    	while(headA!=headB)
    	{
    		if(headA==null)
    			headA=root2;
    		if(headB==null)
    			headB=root1;
    		System.out.println(headA.val+" "+headB.val);
    		headA=headA.next;
    		headB=headB.next;
    	}
    	return headA;
    }
	public static void main(String []args) {
		IntersectionOfLinkedList r=new IntersectionOfLinkedList();
	    
		
		
		r.insertatend(root2, 2,'b');
		
		r.insertatend(root1, 3,'c');
		
		
		
		
		System.out.println(r.Findintersection(root1, root2).val);
		r.print(root2);
		
		
		
	
		
	
		
		
	}

}
