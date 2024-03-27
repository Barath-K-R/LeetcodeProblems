package lists;

import lists.ReverseLinkedListRecursion.Listnode;

public class ReverseLLUsingIteration {

	static Listnode root,lastnode;
	static class Listnode{
		int value;
		Listnode next;
		
		public Listnode(int value){
			this.value=value;
			this.next=null;
		}
		
	}
	
	private ReverseLLUsingIteration(){
		this.root=null;
	}

	public boolean insertatbeginning(int item) {
		
    	Listnode n=new Listnode(item);
    	if(root==null)
		{
			root=n;
			return true;
		}
    	n.next=root;
    	root=n;
    	return true;
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
    
    public void print(Listnode t1) {
    	while(t1!=null) {
    		System.out.print(t1.value+" ");
    		t1=t1.next;
    	}
    	System.out.println();
    }
    
    public void reverse() {
    	Listnode curr=root,prev=null;
    	
    	while(curr!=null)
    	{
    		if(curr.next==null)
    			lastnode=curr;
    		Listnode temp=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=temp;
    	}
    }
	public static void main(String []args) {
		ReverseLLUsingIteration r=new ReverseLLUsingIteration();
		
		
		r.insertatend(1);
		r.insertatend(2);
		r.insertatend(3);
		r.insertatend(4);
		r.insertatend(5);
		r.insertatend(6);
		
		r.print(root);
		
		r.reverse();
		
		r.print(lastnode);
	}
}
