package lists;

import lists.ReverseLLUsingIteration.Listnode;

public class MergeTwoSortedList {
	static Listnode root1,root2,res,dummy;
	static class Listnode{
		int value;
		Listnode next;
		
		public Listnode(int value){
			this.value=value;
			this.next=null;
		}
		
	}
	
	public MergeTwoSortedList(){
		this.root1=null;
		this.root2=null;
		this.res=null;
	}

	
     public boolean insertatend(Listnode root,int item,Character c) {
    	
    	Listnode n=new Listnode(item),t1=root ;
    	if(root==null)
    	{
    		if(c=='a')
    			root1=n;
    		else
    			root2=n;
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
    
    public void sortlist(Listnode list1,Listnode list2) {
    	
    	dummy=new Listnode(0);
    	res=dummy;
    	while(list1!=null && list2!=null)
    	{
    		
    		if(list1.value<list2.value)
    		{
    			
    			res.next=list1;
    			list1=list1.next;
    		}
    		else if(list1.value>list2.value)
    		{
    			
    			res.next=list2;
    			list2=list2.next;
    		}
    		else if(list1.value==list2.value)
    		{
    			
    			res.next=list1;
    			res=res.next;
    			list1=list1.next;
    			res.next=list2;
    		    res=res.next;
    		    list2=list2.next;
    		    continue;
    		}
    		res=res.next;
    	}
    	if(list1==null)
    		res.next=list2;
    	else if(list2==null)
    		res.next=list1;
    		
    		
    }
    
	public static void main(String []args) {
		MergeTwoSortedList r=new MergeTwoSortedList();
	    
		r.insertatend(root1, 1,'a');
		r.insertatend(root1, 3,'a');
		r.insertatend(root1, 4,'a');
		
		r.insertatend(root2, 1,'b');
		r.insertatend(root2, 2,'b');
		r.insertatend(root2, 4,'b');
		
		r.print(root1);
		r.print(root2);
		r.sortlist(root1, root2);
		
		
		r.print(dummy.next);
		
	
		
		
	}
}
