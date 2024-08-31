package Tree;

import java.util.List;

public class DiameterOfBinaryTree {
    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int[]diameter=new int[1];
        diameter[0]=0;
        dfs(root, diameter);
        return diameter[0];

    }

    public static int dfs(TreeNode root,int[] d){
        if(root==null)
        return 0;

        int l=dfs(root.left, d);
        int r=dfs(root.right, d);

        d[0]=Math.max((l+r),d[0]);
        
        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
         TreeNode root=new TreeNode(6);
        root.left=new TreeNode(7);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(4);
        System.out.println(diameterOfBinaryTree(root));
    }
}
