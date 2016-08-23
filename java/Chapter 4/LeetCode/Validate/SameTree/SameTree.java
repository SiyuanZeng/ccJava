package LeetCode.Validate.SameTree;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/17/2016.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }

        if(p.data==q.data){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else{
            return false;
        }
    }
}
