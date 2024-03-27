package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	static TreeNode root;
	static class TreeNode{
		int val;
		TreeNode right,left;
		
		public TreeNode(int d) {
			this.val=d;
			this.left=right=null;
		}
		
	}
	
	public LevelOrderTraversal() {
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
	
	public static List<List<Integer>> bfs(TreeNode root) {
		
		List<List<Integer>> res=new ArrayList<>();
		Queue<TreeNode>queue=new LinkedList<TreeNode>();
		if(root==null)
			return res;
		queue.add(root);
		while(!queue.isEmpty())
		{
			int len=queue.size();
			List<Integer> level = new ArrayList<>();
			for(int i=0;i<len;++i)
			{
				TreeNode curr=queue.poll();
				level.add(curr.val);
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);
				
			}
			res.add(level);
		}
		return res;
	}
	
	public static void main(String []args) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
//		root=new TreeNode(1);
//		root.left=new TreeNode(2);
//		root.right=new TreeNode(3);
//		root.left.left=new TreeNode(4);
//		root.right.right=new TreeNode(5);
		insert(20);
		insert(10);
		insert(30);
		insert(5);
		insert(15);
		insert(25);
		insert(35);
		insert(4);
		insert(6);
		insert(12);
		insert(18);
		insert(23);
		insert(28);
		insert(32);
		insert(37);
       
		
		res=bfs(root);
		for(int i=0;i<res.size();++i)
		{
	        System.out.println(res.get(i));
		}
	}
	
	
	
	

}
