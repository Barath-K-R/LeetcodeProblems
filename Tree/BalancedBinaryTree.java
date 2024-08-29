package Tree;

/**
 * BalancedBinaryTree
 */
public class BalancedBinaryTree {

    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static boolean isBalanced(TreeNode root) {
       if(dfs(root)==-1)
       return false;
       else
       return true;
    }

    public static int dfs(TreeNode n){
            if(n==null)
            return 0;
    
            int l=dfs(n.left);
            int r=dfs(n.right);
    
            if(l==-1 || r==-1)
            return -1;
    
            if(Math.abs(l-r)>1)
            return -1;
            return 1+Math.max(l,r);
        
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(isBalanced(root));
    }
}
