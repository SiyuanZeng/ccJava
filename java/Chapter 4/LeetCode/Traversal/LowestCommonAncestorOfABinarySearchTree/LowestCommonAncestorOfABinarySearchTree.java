package LeetCode.Traversal.LowestCommonAncestorOfABinarySearchTree;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode m = root;

        if(m.data > p.data && m.data < q.data){
            return m;
        }else if(m.data>p.data && m.data > q.data){
            return lowestCommonAncestor(root.left, p, q);
        }else if(m.data<p.data && m.data < q.data){
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
