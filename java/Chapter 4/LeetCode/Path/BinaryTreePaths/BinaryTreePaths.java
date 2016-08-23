package LeetCode.Path.BinaryTreePaths;

import CtCILibrary.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SiyuanZeng's on 5/15/2016.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null) {
            return result;
        }
        findPaths(root, result, root.data + "");
        return result;
    }

    private void findPaths(TreeNode root, List<String> result, String cur) {
        if (root.left == null && root.right == null) {
            result.add(cur);
            return;
        }
        if (root.left != null) {
            findPaths(root.left, result, cur + "->" + root.left.data);
        }
        if (root.right != null) {
            findPaths(root.right, result, cur + "->" + root.right.data);
        }
    }
}
