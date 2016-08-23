package LeetCode.Traversal.BasicTraversal_StackBased;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PostOrderTraversal{
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();

        if(root == null)
            return lst;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode prev = null;
        while(!stack.empty()){
            TreeNode curr = stack.peek();
            // go down the tree.
            //check if current node is leaf, if so, process it and pop stack,
            //otherwise, keep going down
            if(prev == null || prev.left == curr || prev.right == curr){ // This is very important.
                //prev == null is the situation for the root node
                if(curr.left != null){
                    stack.push(curr.left);
                }else if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    lst.add(curr.data);
                }
                //go up the tree from left node
                //need to check if there is a right child
                //if yes, push it to stack
                //otherwise, process parent and pop stack
            }else if(curr.left == prev){
                if(curr.right != null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    lst.add(curr.data);
                }
                //go up the tree from right node
                //after coming back from right node, process parent node and pop stack.
            }else if(curr.right == prev){
                stack.pop();
                lst.add(curr.data);
            }
            prev = curr;
        }
        return lst;
    }

    public static List<Integer> postorderTraversal2_Simple(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        if(root==null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        //Stack: pushing right, left, top
        //This is also done by layer
        //What do you mean layer by layer? Dig in, both sides at the same time.
        while(!stack.isEmpty()) {//left and right by pushing right and left with peeking and poping after both are null. Poping last.
            TreeNode temp = stack.peek();
            if(temp.left!=null && temp.right!=null) { // It is not pop here, if it has childrens. It will pop after all these are add
                if(temp.right!=null) {
                    stack.push(temp.right);
                    temp.right = null;
                }// reverse order, pushing right first, then pushing left.
                if(temp.left!=null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            } else {
                TreeNode pop = stack.pop();
                res.add(pop.data);
            }
        }

        return res;
    }
}