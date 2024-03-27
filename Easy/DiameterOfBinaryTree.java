//Diameter of a binary tree

package Easy;

class Node{
	int data;
	Node left,right;
	
	public Node(int value) {
		this.data=value;
		this.left=right=null;
	}
}
public class DiameterOfBinaryTree {

	Node root=null;
	static int max=0;
	public int diameter(Node n)
	{
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		
        int diameter=leftheight+rightheight+2;
		
		if(diameter>max)
			max=diameter;
		
		return Math.max(1+leftheight,1+rightheight);
		
		
		
	}
	
	public int height(Node n) {
		if(n==null)
			return -1;
		
		int lheight=height(n.left),rheight=height(n.right);
		int diameter=lheight+rheight+2;
		
		if(diameter>max)
			max=diameter;
		
		return Math.max(1+lheight,1+rheight);
		
		
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiameterOfBinaryTree b=new DiameterOfBinaryTree();
		b.root=new Node(1);
		b.root.left=new Node(2);
		b.root.left.left = new Node(3);
        b.root.left.right = new Node(4);
        b.root.left.left.left=new Node(5);
        b.root.left.right.right=new Node(6);
        b.diameter(b.root);
        
        System.out.println("max="+max);

	}

}
