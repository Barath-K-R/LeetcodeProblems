package Easy;


public class LowestCommonAncestor {
    static Node root;
	class Node{
		int data;
		Node right;
		Node left;
		
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public LowestCommonAncestor() {
		root=null;
	}
	
	
	public int lca(Node n,int p,int q) {
		if(p<n.data && q>n.data || p>n.data && q<n.data)
			return n.data;
		else if(p==n.data || q==n.data)
			return n.data;
		else
		{
			if(p<n.data && q<n.data)
			return lca(n.left,p,q);
			else if(p>n.data && q>n.data)
				return lca(n.right,p,q);
		}
		return 0;
	}
	
	public void insert(int data) {
		Node n=new Node(data);
		Node t1=root,t2=root;
		if(root==null)
		{
			root=n;
			return;
		}
		while(t1!=null) {
			t2=t1;
			if(data<t1.data)
				t1=t1.left;
			else if(data>t1.data)
				t1=t1.right;
		}
		if(data<t2.data)
			t2.left=n;
		else
			t2.right=n;
	}
	
	public void preorder(Node n) {
		if(n==null)
			return;
		System.out.println(n.data);
		preorder(n.left);
		preorder(n.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowestCommonAncestor l=new LowestCommonAncestor();
		
		l.insert(6);
		l.insert(2);
		l.insert(8);
		l.insert(0);
		l.insert(4);
		l.insert(7);
		l.insert(9);
		l.insert(3);
		l.insert(5);
		
		
		
		int p=5,q=3;
		
		System.out.println(l.lca(root,p,q));
		
		

	}

}
