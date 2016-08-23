package LeetCode.Subtree.CountUnivalueSubtrees;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class CountUnivalueSubtrees {

    public int countUnidataSubtrees(TreeNode root) {
        unidata(root);
        return count;
    }

    private boolean unidata(TreeNode root) {
        if(root == null)
            return true;
        if(root.left ==null && root.right == null) {
            count++;
            return true;
        }
        boolean left = unidata(root.left);
        boolean right = unidata(root.right);
        if(left && right && (root.left == null || root.left.data == root.data) && (root.right == null || root.right.data == root.data)) {
            count++;
            return true;
        }
        return false;
    }

    private int count = 0;
}
