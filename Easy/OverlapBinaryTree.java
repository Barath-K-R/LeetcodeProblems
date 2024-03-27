package Easy;

public class OverlapBinaryTree {

	static class Node {
		int data;
		Node left, right;

		public Node(int value) {
			this.data = value;
			this.left = right = null;
		}
	}

	static Node root1 = null, root2 = null, root3 = null;

	public void overlap(Node n1, Node n2, Node n3) {
		
		if(n1==null && n2==null)
			return;
		System.out.println(n1!=null?n1.data:null);
		int v1left = 0, v2left = 0, v3left = 0, v1right = 0, v2right = 0, v3right = 0;
		
		if (n1 != null) {
			v1left = (int)( n1.left!=null?n1.left.data:0);
			v1right = (int) ( n1.right!=null?n1.right.data:0);
		}
		if(n2!=null)
		{
			v2left = (int) (n2.left!=null?n2.left.data:0);
			v2right = (int) (n2.right!=null?n2.right.data:0);
		}
		
		v3left = v1left + v2left;
		v3right = v1right + v2right;
		
		if(v3left!=0)
		n3.left = new Node(v3left);
		else
			n3.left=null;
		
		if(v3right!=0)
		n3.right = new Node(v3right);
		else
			n3.right=null;
		
		overlap(n1!=null?n1.left:null, n2!=null?n2.left:null, n3.left);
		overlap(n1!=null?n1.right:null,n2!=null?n2.right:null, n3.right);

	}

	public void printtree(Node n) {
		if (n == null)
			return;

		printtree(n.left);
		printtree(n.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverlapBinaryTree i = new OverlapBinaryTree();
		root1 = new Node(1);
		root1.left = new Node(3);
		root1.right = new Node(2);
		root1.left.left = new Node(5);

		root2 = new Node(2);
		root2.left = new Node(1);
		root2.right = new Node(3);
		root2.left.right = new Node(4);
		root2.right.right = new Node(7);

		if (root1 != null && root2 != null)
			root3 = new Node(root1.data + root2.data);
		
		i.printtree(root3);
		i.overlap(root1, root2, root3);

		
		

	}

}
