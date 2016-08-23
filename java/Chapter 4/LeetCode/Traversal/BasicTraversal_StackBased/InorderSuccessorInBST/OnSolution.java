package LeetCode.Traversal.BasicTraversal_StackBased.InorderSuccessorInBST;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/14/2016.
 */
public class OnSolution {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            if (root == null || p == null) {
                return null;
            }

            if (p.right != null) {
                return findMin(p.right);
            }

            // Case 2: p.right == null
            TreeNode succ = null;
            TreeNode q = root;

            while (q != null) {
                if (q.data > p.data) {
                    succ = q;
                    q = q.left;
                } else if (q.data < p.data) {
                    q = q.right;
                } else {
                    break;
                }
            }

            return succ;
        }

        private TreeNode findMin(TreeNode root) {
            TreeNode p = root;

            while (p.left != null) {
                p = p.left;
            }

            return p;
        }
}
