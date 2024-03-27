package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.event.TreeExpansionEvent;

import Tree.LevelOrderTraversal.TreeNode;

public class ValidateBinarySearch {

	static TreeNode root;
	static class TreeNode{
		int val;
		TreeNode right,left;
		
		public TreeNode(int d) {
			this.val=d;
			this.left=right=null;
		}
		
	}
	
	public void ValidateBinarySearch() {
		root=null;
	}
	
	
	public static void insert(int value) {
		TreeNode newnode=new TreeNode(value);
		if(root==null)
		{
			root=newnode;
			return;
		}
		TreeNode t1 = root,t2=root;
		
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
	
	public static boolean isValidBST(TreeNode root) {
		if(root==null)
			return true;
		return valid(root, null, null);
	}
	public static boolean  valid(TreeNode t,Integer min,Integer max)
	{
		if(t==null)
			return true;
		System.out.println(t.val+" "+min+" "+max);
		if((min!=null && t.val<=min) || (max!=null && t.val>=max))
		return false;
		
		return valid(t.left, min, t.val) && valid(t.right, t.val, max);
		
	}
	public static void main(String []args) {
		ValidateBinarySearch v=new ValidateBinarySearch();
		root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.right=new TreeNode(7);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(8);
		
//		insert(20);
//		insert(10);
//		insert(30);
//		insert(5);
//		insert(15);
//		insert(25);
//		insert(35);
//		insert(4);
//		insert(6);
//		insert(12);
//		insert(18);
//		insert(23);
//		insert(28);
//		insert(32);
//		insert(31);
        System.out.println(isValidBST(root));
	}

}
