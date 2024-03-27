package Easy;

import java.util.*;

public class RemoveDuplicatesLinkedList {
    private static Node root;
	static class Node{
		int data;
		Node link;
		public Node(int data) {
			this.data=data;
			link=null;
		}
	}
	
	 public static void insert(int value) {
		Node n=new Node(value);
		
	    Node t=root;
	    
	    while(t.link!=null) {
	    	t=t.link;
	    }
	    t.link=n;
	}
	 
	 public static void removeduplicates() {
		 ArrayList<Integer>h=new ArrayList<Integer>();
		 Node curr=root;
		 h.add(curr.data);
		 while(curr.link!=null) {
			 
			 if(h.contains(curr.link.data))
			 {
				 curr.link=curr.link.link;
				 continue;
			 }
			 else
			 {
				 curr=curr.link;
				 h.add(curr.data);
			 }
		 }
	 }
	 
	 public static void print() {
		 Node t=root;
		 while(t!=null) {
			 System.out.print(t.data+" ");
			 t=t.link;
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesLinkedList r=new RemoveDuplicatesLinkedList();
		root=new Node(1);
		insert(1);
		insert(1);
		insert(3);
		insert(3);
		
		removeduplicates();
		print();
		
		

	}

}
