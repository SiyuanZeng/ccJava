package LeetCode.Value;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/9/2016.
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        if(root == null)
            return 0;

        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    public int[] helper(TreeNode root){
        if(root == null){
            int[] result = {0, 0};
            return result;
        }

        int[] result = new int[2];
        int[] left = helper(root.left);
        int[] right = helper (root.right);

        // result[0] is when root is selected, result[1] is when not.
        // The node is not selected
        // The left and right[1] is the result that root node is not selected.

        result[0] = root.data + left[1] + right[1];

        // Left, including the root and not
        // Right, including the root and not
        // Left + Right
        // Result[1] is not select
        // How to read this thing?
        // There is not root node in the following.
        // Current root node is not selected. It is a recursive process, either the current root node selected as the abobe line.
        // Or like the following line that the current root node is not selected and compare the deeper levels of left and right values to get the maximum values.
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return result;
    }
}
