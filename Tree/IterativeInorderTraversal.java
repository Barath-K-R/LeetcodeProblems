package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorderTraversal {
    
static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int value){
            data=value;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(8);
        root.left.right=new TreeNode(9);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(6);
        Stack<TreeNode>st=new Stack<>();
        List<Integer>list=new ArrayList<>();
        TreeNode curr=root;
        while(true){
            if(curr==null){
                if(st.isEmpty())
                break;
                curr=st.pop();
                list.add(curr.data);
                curr=curr.right;
            }
            else{
                st.push(curr);
                curr=curr.left;
            }
            
        }
       System.out.println(list);
    }
}
