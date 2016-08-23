package LeetCode.Traversal.LowestCommonAncestorOfABinaryTree;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */


class Entity{
    public int count;
    public TreeNode node;

    public Entity(int count, TreeNode node){
        this.count = count;
        this.node = node;
    }
}

public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lcaHelper(root, p, q).node;
    }

    public Entity lcaHelper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return new Entity(0, null);

        Entity left = lcaHelper(root.left, p, q);
        if(left.count==2)
            return left;

        Entity right = lcaHelper(root.right,p,q);
        if(right.count==2)
            return right;

        int numTotal = left.count + right.count;
        if(root== p || root == q){
            numTotal++;
        }

        return new Entity(numTotal, root);
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null&&right!=null) return root;
        return left == null ? right : left;
    }
}