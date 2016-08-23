package LeetCode.Traversal.BasicTraversal_StackBased.BinarySearchTreeIterator;

import CtCILibrary.TreeNode;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */

// This one is similiar to inorder iteration and inorderSucessor
public class BSTIterator {
        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new Stack<TreeNode>();
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public int next() {
            TreeNode node = stack.pop();
            int result = node.data;
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
            return result;
        }
}
