package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.MaximumDepthOfBinaryTree.TreeNode;

public class LowestCommonAncestor {
	static TreeNode head;
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
	public LowestCommonAncestor() {
		head=null;
	}
	
	public static TreeNode insert(int value) {
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
	
	public static TreeNode lowestcommonancestor(TreeNode root,TreeNode p,TreeNode q) {
	    if((p.val<root.val && q.val>root.val) || (p.val>root.val && q.val<root.val))
	    	return root;
		else if(p.val<root.val && q.val<root.val)
			return lowestcommonancestor(root.left, p, q);
		else if(p.val>root.val && q.val>root.val)
			return lowestcommonancestor(root.right, p, q);
		else if(p.val==root.val || q.val==root.val)
		{
			if(p.val==root.val)
				return p;
			else if(q.val==root.val)
				return q;
		}
	    return root;
	}
	public static void main(String[] args) {
		head=new TreeNode(6);
		head.left=new TreeNode(2);
		head.right=new TreeNode(8);
		head.left.left=new TreeNode(0);
		head.left.right=new TreeNode(4);
		head.left.right.left=new TreeNode(3);
		head.left.right.right=new TreeNode(5);
		head.right.left=new TreeNode(7);
		head.right.right=new TreeNode(9);
	    bfs(head);
	    System.out.println(lowestcommonancestor(head,head.left,head.left.right.right).val);
	    bfs(head);
	}

}
