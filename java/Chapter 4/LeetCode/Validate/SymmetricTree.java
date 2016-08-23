package LeetCode.Validate;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class SymmetricTree {

    public boolean isSymmetricTree(TreeNode p,TreeNode q){
        if(p == null&&q == null)
            return true;
        if(p == null||q == null)
            return false;
        return (p.data == q.data) && isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;

        return isSymmetricTree(root.left,root.right);
    }
}
