package Tree;

public class CountGoodNodesInBinaryTree {
    public static class TreeNode {
        int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
}
public static int goodNodes(TreeNode root) {
    return count(root, Integer.MIN_VALUE); 
}

public static int count(TreeNode root, int max) {
    if (root == null) 
        return 0; 
    int goodNodeCount = 0; 

    if (root.val >= max) { 
        goodNodeCount++;
        max = root.val; 
    }

    goodNodeCount += count(root.left, max);
    goodNodeCount += count(root.right, max);

    return goodNodeCount; 
}

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.left=new TreeNode(3);
        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(5);
        System.out.println(goodNodes(root));

    }
}
