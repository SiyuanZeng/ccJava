package LeetCode.Subtree.FindTheLargestBSTSubtree;

/**
 * Created by SiyuanZeng's on 5/13/2016.
 */

import CtCILibrary.TreeNode;

/**
 * Definition for a binary tree node.
 * public class LeetCode.Traversal.TreeNode {
 *     int val;
 *     LeetCode.Traversal.TreeNode left;
 *     LeetCode.Traversal.TreeNode right;
 *     LeetCode.Traversal.TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int largestBSTSubtree(TreeNode root) {
        int [] res = {0};
        helper(root, res);
        return res[0];
    }

    private Node helper(TreeNode root, int [] res){
        Node cur = new Node();
        if(root == null){
            cur.isBST = true;
            return cur;
        }
        Node left = helper(root.left, res);
        Node right = helper(root.right, res);
        if(left.isBST && root.data > left.max && right.isBST && root.data < right.min){
            cur.isBST = true;
            cur.min = Math.min(root.data , left.min);//This is great, I like this one, why is this correct?
            cur.max = Math.max(root.data , right.max);
            cur.size = left.size + right.size + 1;
            if(cur.size > res[0]){
                res[0] = cur.size;
            }
        }
        return cur;
    }
}

class Node{
    boolean isBST;
    int min;
    int max;
    int size;
    public Node(){
        isBST = false;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        size = 0;
    }
}
