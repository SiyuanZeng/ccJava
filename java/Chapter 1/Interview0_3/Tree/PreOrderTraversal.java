package Interview0_3.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/5/2016.
 */
public class PreOrderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class Solution {
        public ArrayList<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> returnList = new ArrayList<Integer>();

            if(root == null)
                return returnList;

            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            // pop top, right left.
            // left > top, right, left.
            // This is done layer by layer, it will always do the left first. how about others?
            //
            while(!stack.empty()){// pop and then left and right by pushing right then left. 2) poppoing first
                TreeNode n = stack.pop();
                returnList.add(n.val);
                // This is done layer by layer.
                if(n.right != null){
                    stack.push(n.right);
                }
                if(n.left != null){
                    stack.push(n.left);
                }

            }
            return returnList;
        }
    }

}
