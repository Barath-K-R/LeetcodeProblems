package Easy;

public class SubtreeOfAnotherTree {
    static Node s=null,t=null;
	 class Node{
		int data;
		Node right,left;
		public Node(int i) {
			// TODO Auto-generated constructor stub
			this.right=null;
			this.left=null;
			this.data=i;
		}
		
	}
	
	public static boolean issubtree(Node s, Node t) {
		if(s==null && t==null)
			return true;
		if(t==null)
			return true;
		if(s==null && t!=null)
			return false;
		System.out.println("issubtree "+s.data+" "+t.data);
		if(sametree(s,t))
			return true;
		
		return (sametree(s.left,t) || sametree(s.right,t));
		
		
	}
	
	public static boolean sametree(Node s,Node t) {
		
		if(s==null && t==null)
			return true;
		
		if(s!=null && t!=null && s.data==t.data)
		{
			return (sametree(s.left,t.left) && sametree(s.right,t.right));
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtreeOfAnotherTree sub=new SubtreeOfAnotherTree();
		s=sub.new Node(3);
		s.left=sub.new Node(4);
		s.right=sub.new Node(5);
		s.left.left=sub.new Node(1);
		s.left.right=sub.new Node(2);
		s.left.right.left=sub.new Node(0);
		
		t=sub.new Node(4);
		t.left=sub.new Node(1);
		t.right=sub.new Node(2);
		
		
		System.out.println(issubtree(s,t));
	}

}
