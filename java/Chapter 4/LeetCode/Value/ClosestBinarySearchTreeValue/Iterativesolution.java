package LeetCode.Value.ClosestBinarySearchTreeValue;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/14/2016.
 */
public class Iterativesolution {
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            throw new NullPointerException("Tree must be non-empty");
        }

        int result = 0;
        double gap = Double.MAX_VALUE;

        while (root != null) {
            if (root.data == target) {
                return root.data;
            }

            double dist = Math.abs(root.data - target);
            if (dist < gap) {
                result = root.data;
                gap = dist;
            }

            if (target > root.data) {
                root = root.right;
            } else if (target < root.data) {
                root = root.left;
            }
        }
        return result;
    }
}
