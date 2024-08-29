package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrderTraversal {
    
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
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            else if(curr==null){
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    list.add(temp.data);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.pop();
                        list.add(temp.data);
                    }
                }
                else
                curr=temp;
            }
        }
       System.out.println(list);
    }
}
