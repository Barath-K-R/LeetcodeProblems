package Tree;

import java.util.*;

import javax.swing.plaf.synth.SynthListUI;

public class BinaryTreeRightSideView {

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
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root!=null)
        bfs(list,root);
        return list;
    }
    public static void bfs(List<Integer>list,TreeNode root){
       Queue<TreeNode>q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
            int breadth=q.size();
            for(int i=1;i<=breadth;++i){
               TreeNode temp=q.poll();
                if(i==breadth)
                list.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                
            }
       }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        List<Integer>res=rightSideView(root);
        System.out.println(res);
    }
}
