package LeetCode.Traversal.BasicTraversal_StackBased.InorderSuccessorInBST;

import CtCILibrary.TreeNode;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 5/14/2016.
 */
public class InorderSuccessorInBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            if (root == null || p == null) {
                return null;
            }

            if (p == root) {
                return p.right;
            }

            Stack<TreeNode> stack = new Stack<>();
            TreeNode q = root;

            while (!stack.isEmpty() || q != null) {
                if (q != null) {
                    stack.push(q);
                    q = q.left;// Why is there a place, they assign null to the left node?
                } else {
                    TreeNode curr = stack.pop();
                    q = curr.right;

                    if (curr == p) {
                        if (curr.right != null) {// There are so many fucking ifs, how am I supposed to remember all these shits??Will recruitor judge me because I curse? Please let me know! siyuanzeng@gmail.com Thanks you!!!!
                            TreeNode m = curr.right;
                            while (m.left != null) {
                                m = m.left;
                            }
                            return m;
                        } else if (!stack.isEmpty()){
                            return stack.pop();
                        }
                    }
                }
            }

            return null;
        }
}
