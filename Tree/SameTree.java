package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.MaximumDepthOfBinaryTree.TreeNode;

public class SameTree {
	static TreeNode p,q;
	static class TreeNode{
		int val;
		TreeNode right,left;
		public TreeNode(int val) {
			super();
			this.val = val;
			this.right=null;
			this.left=null;
		}
	}
	public SameTree() {
		p=null;
		q=null;
	}
	
	public static TreeNode insert(int value,TreeNode head) {
		TreeNode newnode=new TreeNode(value);
		
		if(head==null)
		{
			System.out.println("head="+newnode.val);
			head=newnode;
			return head;
		}
		TreeNode t1 = head,t2=head;
		
		while(t1!=null)
		{
			t2=t1;
			if(value<t1.val)
				t1=t1.left;
			else
				t1=t1.right;
		}
		if(value<t2.val)
			t2.left=newnode;
		else
			t2.right=newnode;
		return head;
		
	}
	
	public static void bfs(TreeNode root) {
		Queue q=new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			TreeNode curr=(TreeNode)q.poll();
			System.out.print(curr.val+" ");
			if(curr.left!=null && (!q.contains(curr.left)))
				q.add(curr.left);
			if(curr.right!=null && (!q.contains(curr.right)))
				q.add(curr.right);
			
		}
		System.out.println();
	}
	
	public static boolean sametree(TreeNode p,TreeNode q) {
		if(p==null && q==null)
			return true;
		else if(p!=null && q==null || (p==null && q!=null))
			return false;
		System.out.println(p.val+" "+q.val);
		if(p.val!=q.val)
			return false;
		if(!sametree(p.left,q.left))
			return false;
		if(!sametree(p.right,q.right))
			return false;
		return true;
	}
	public static void main(String[] args) {
		SameTree sameTree=new SameTree();
		p=insert(4,p);
		p=insert(2,p);
		p=insert(7,p);
		p=insert(1,p);
		q=insert(4,q);
	    q=insert(3,q);
	    q=insert(7,q);
	    q=insert(1, q);
	   
	    System.out.println(sametree(p,q));
	    
	}

}
