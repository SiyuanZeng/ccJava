package LeetCode.Path.BinaryTreeLongestConsecutiveSequence;

import CtCILibrary.TreeNode;

/**
 * Created by SiyuanZeng's on 5/13/2016.
 */
public class Solution {
    public int longestConsecutive(TreeNode root) {
        if(root == null){
            return 0;
        }
        return findLongest(root, 0, root.data - 1);
    }

    private int findLongest(TreeNode root, int length, int preVal){
        if(root == null){
            return length;
        }
        // ????????
        int currLen = preVal + 1 == root.data ? length + 1 : 1;
        // ?????????????????????????
        return Math.max(currLen,
            Math.max(
                findLongest(root.left, currLen, root.data),
                findLongest(root.right, currLen, root.data)
            )
        );
    }
}