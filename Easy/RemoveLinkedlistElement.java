package Easy;

public class RemoveLinkedlistElement {
    static Node root;
	 static class Node{
		int data;
		Node link;
		
		public Node(int data) {
			this.data=data;
			link=null;
		}
	}
	
	public RemoveLinkedlistElement() {
		root=null;
	}
	
	public static void insert(int data) {

		Node n=new Node(data),t1=root,t2=root;
		if(root==null)
		{
			root=n;
			return;
		}
		while(t1!=null)
		{
			t2=t1;
			t1=t1.link;
		}
		t2.link=n;
		
	}
	
	public static void remove(int value) {
		Node t1=root,t2=root;
		if(root.data==value)
			root=null;
		while(t1!=null) {
			if(t1.data!=value)
			{
				t2=t1;
				t1=t1.link;
			}
			else {
				t2.link=t1.link;
				t1.link=null;
				t1=t2.link;
			}
		}
	}
	
	public static void print() {
		Node t1=root;
		while(t1!=null)
		{
			System.out.println(t1.data);
			t1=t1.link;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insert(1);
		insert(2);
		insert(6);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		
		remove(3);
		
		print();

	}

}
