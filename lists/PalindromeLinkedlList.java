package lists;



public class PalindromeLinkedlList {

	static Listnode root;
	static class Listnode{
		int value;
		Listnode next;
		
		public Listnode(int value){
			this.value=value;
			this.next=null;
		}
		
	}
	
	public PalindromeLinkedlList(){
		this.root=null;
		
	}

	
     public boolean insertatend(int item) {
    	
    	Listnode n=new Listnode(item),t1=root ;
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
    	Listnode t1=root;
    	while(t1!=null) {
    		System.out.print(t1.value+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
   
    public boolean checkpalindrome() {
    	Listnode slow=root,fast=root,prev=null;
    	int length=0;
    	while(fast!=null && fast.next!=null)
    	{
    		
    		fast=fast.next.next;
    		prev=slow;
    		slow=slow.next;
    		length++;
    	}
    	
    	if(fast==null)
    		length=length+length;
    	else
    	{
    		length=(length+length)+1;
    	}
    	
    	while(slow!=null) {
    		Listnode temp=slow.next;
    		slow.next=prev;
    		prev=slow;
    		slow=temp;
    	}
    	Listnode t2=root;
    	
    	int temp=0;
    	while(temp<(length/2)) {
    		
    		if(prev.value!=t2.value)
    			return false;
    		t2=t2.next;
    		prev=prev.next;
    		temp++;
    	}
    	
    	return true;
    	
    	
    }
	public static void main(String []args) {
		PalindromeLinkedlList r=new PalindromeLinkedlList();
	    
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(8);
		r.insertatend(8);
		r.insertatend(3);
		r.insertatend(2);
		r.insertatend(1);
		
		System.out.println(r.checkpalindrome());
		
		
		
		
		
		
		
	
		
		
	}
}
