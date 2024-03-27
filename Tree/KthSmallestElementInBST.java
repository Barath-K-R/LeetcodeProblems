package Tree;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import Tree.MaximumDepthOfBinaryTree.TreeNode;

public class KthSmallestElementInBST {

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
	public KthSmallestElementInBST() {
		head=null;
	}
	
	public static void insert(int value) {
		TreeNode newnode=new TreeNode(value);
		if(head==null)
		{
			head=newnode;
			return;
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
	public static PriorityQueue<Integer> find(TreeNode root,int k,PriorityQueue<Integer> q) {
		if(root==null)
			return q;
		if(q.peek()>root.val && q.size()>=k)
		{
			q.poll();
			q.add(root.val);
		}
		else if(q.peek()>root.val)
			q.add(root.val);
	    q=find(root.left, k, q);
	    q=find(root.right, k, q);
		return q;
	}
	public static int kthSmallest(TreeNode root,int k) {
		PriorityQueue<Integer>q=new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(Integer.MAX_VALUE);
		q=find(root, k, q);
		return q.poll();
	}
	public static void main(String[] args) {
		insert(4);
		insert(2);
		insert(7);
		insert(1);
		insert(3);
	    insert(6);
	    insert(9);
	    bfs(head);
	    System.out.println(kthSmallest(head,2));
	    bfs(head);
	}

}
