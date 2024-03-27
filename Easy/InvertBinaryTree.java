package Easy;



public class InvertBinaryTree {
	
	class Node{
		int data;
		Node left,right;
		
		public Node(int value) {
			this.data=value;
			this.left=right=null;
		}
	}
    static Node root=null;
    
    public void invert(Node n) {
    	
    	if(n==null)
    		return;
    	Node temp=n.left;
    	n.left=n.right;
    	n.right=temp;
    	invert(n.left);
    	invert(n.right);
    	
    }
    
    public void printtree(Node n) {
    	if(n==null)
    		return;
    	System.out.println(n.data);
    	printtree(n.left);
    	printtree(n.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvertBinaryTree i=new InvertBinaryTree();
        root=i.new Node(4);
        root.left=i.new Node(2);
        root.right=i.new Node(7);
        root.left.left=i.new Node(1);
        root.left.right=i.new Node(3);
        root.right.left=i.new Node(6);
        root.right.right=i.new Node(9);
        
        i.printtree(root);
        
        System.out.println();
        i.invert(root);
        
        i.printtree(root);
        
       }

}
