package LeetCode.Value.ClosestBinarySearchTreeValue;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/14/2016.
 */
public class CodeJava {
    private double min = Double.MAX_VALUE;
    private int ans = 0;
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        closestValueHelper(root, target);

        return ans;
    }

    private void closestValueHelper(TreeNode root, double target) {
        if (root == null) {
            return;
        }

        if (Math.abs((double) root.data - target) < min) {
            min = Math.abs((double) root.data - target);
            ans = root.data;
        }

        if (root.data > target) {
            closestValueHelper(root.left, target);
        } else if (root.data < target) {
            closestValueHelper(root.right, target);
        }
    }
}
