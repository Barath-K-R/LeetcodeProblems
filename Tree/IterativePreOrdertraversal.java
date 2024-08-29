package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrdertraversal {
    
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
        Stack<TreeNode>st=new Stack<>();
        List<Integer>list=new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            list.add(temp.data);
            if(temp.right!=null)
            st.push(temp.right);
            if(temp.left!=null)
            st.push(temp.left);
        }
       System.out.println(list);
    }
}
