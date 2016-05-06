package Interview0_3.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Definition for binary tree


public class InOrderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> lst = new ArrayList<Integer>();

        if(root == null)
            return lst;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        //define a pointer to track nodes
        TreeNode p = root;

        while(!stack.empty() || p != null){
            // if it is not null, push to stack
            //and go down the tree to left
            if(p != null){
                stack.push(p);
                p = p.left;

                // if no left child
                // pop stack, process the node
                // then let p point to the right
            }else{
                TreeNode t = stack.pop();
                lst.add(t.val);
                p = t.right;
            }
        }

        return lst;
    }

    // Recursive
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal_Recursive(TreeNode root) {
        if(root !=null){
            helper(root);
        }

        return result;
    }

    public void helper(TreeNode p){
        if(p.left!=null)
            helper(p.left);

        result.add(p.val);

        if(p.right!=null)
            helper(p.right);
    }


    // Simple
    public List<Integer> inorderTraversal3_Simple(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null)
            return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);


        // left, top, right
        //This is not done by layer, go to the buttom.
        //What do you mean done by layer?
        while(!stack.isEmpty()){// Left first then itself then right by pushing all left first, then poping the branch one by one while pushing right node to the tree.
            TreeNode top = stack.peek();// return the reference
            if(top.left!=null){// The value is not pop before the left node are poped.
                stack.push(top.left);// detach the left node with top node until the last left node that its left node is null, then it starts to add it into the list
                top.left=null;// remove its children node
            }else{
                result.add(top.val);
                stack.pop();// Remove it, it doesn't have left for sure because we removed it already and this is the top node.
                if(top.right!=null){//Add its value, if top, then right. if side, next top will be print.
                    stack.push(top.right);// When it come again, it will add its value and then its right value.
                }
            }
        }

        return result;
    }
}