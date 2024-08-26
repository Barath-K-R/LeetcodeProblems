package Tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        dfs(root,list);
        return list;
    }
    public static void dfs(TreeNode n,List<Integer>list){
        if(n==null)
        return;

        list.add(n.data);
        dfs(n.left,list);
        dfs(n.right,list);

    }
    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(7);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(4);
        List<Integer>res=postorderTraversal(root);
        System.out.println(res);
    }
}
