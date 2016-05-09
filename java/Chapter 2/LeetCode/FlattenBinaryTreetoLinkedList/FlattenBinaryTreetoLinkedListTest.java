package LeetCode.FlattenBinaryTreetoLinkedList;

import CtCILibrary.TreeNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class FlattenBinaryTreetoLinkedListTest {

    @Test
    public void testFlatten() throws Exception {
            int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
            TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
            FlattenBinaryTreetoLinkedList.flatten(root); // How is the tree got created?
    }
}