package LeetCode.FlattenBinaryTreetoLinkedList;

import CtCILibrary.TreeNode;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class FlattenBinaryTreetoLinkedList {
    /**
     * Definition for binary tree
     * public class LeetCode.Traversal.TreeNode {
     *     int val;
     *     LeetCode.Traversal.TreeNode left;
     *     LeetCode.Traversal.TreeNode right;
     *     LeetCode.Traversal.TreeNode(int x) { val = x; }
     * }
     */
        public static void flatten(TreeNode root) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode p = root;

            while(p != null || !stack.empty()){

                if(p.right != null){
                    stack.push(p.right);// This is the whole thread
                }

                if(p.left != null){
                    p.right = p.left;
                    p.left = null;
                }else if(!stack.empty()){
                    TreeNode temp = stack.pop();
                    p.right=temp;
                }

                p = p.right;
        }
    }
}
