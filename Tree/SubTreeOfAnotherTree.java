package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Flow.Publisher;

import Tree.SameTree.TreeNode;

public class SubTreeOfAnotherTree {
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
	public SubTreeOfAnotherTree() {
		p=null;
		q=null;
	}
	
	public static TreeNode insert(int value,TreeNode head) {
		TreeNode newnode=new TreeNode(value);
		
		if(head==null)
		{
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
	
	public static boolean isSameTree(TreeNode root,TreeNode subRoot)
	{
		if(root==null && subRoot==null)
			return true;
		 if (root == null || subRoot== null || root.val != subRoot.val) {
	            return false;
	        }
		 return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
		 
	}
	public static boolean isSubtree(TreeNode root,TreeNode subRoot) {
		
		if(subRoot==null || isSameTree(root, subRoot))
			return true;
		if(root==null)
			return false;
		
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}
	public static void main(String[] args) {
		SubTreeOfAnotherTree sameTree=new SubTreeOfAnotherTree();
		p=new TreeNode(1);
		p.left=new TreeNode(1);
		
//		p=insert(1,p);
//		p=insert(1,p);
//		p=insert(5,p);
//		p=insert(1,p);
//		p=insert(3,p);
//	    q=insert(2,q);
//	    q=insert(1,q);
//	    q=insert(7, q);
		q=new TreeNode(1);
		
	   bfs(q);
	    System.out.println(isSubtree(p,q));
	    
	}

}
