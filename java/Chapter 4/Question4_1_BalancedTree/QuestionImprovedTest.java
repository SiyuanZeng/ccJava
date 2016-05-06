package Question4_1_BalancedTree;

import CtCILibrary.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SiyuanZeng's on 5/1/2016.
 */
public class QuestionImprovedTest {

    @Test
    public void testCheckHeight3() throws Exception {
        assertEquals(0, QuestionImproved.checkHeight(null)); // How is the tree got created?

    }

    @Test
    public void testCheckHeightLeftMinus34() throws Exception {
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
        root.insertInOrder(-1); // Add 4 to make it unbalanced
        root.insertInOrder(-2); // Add 4 to make it unbalanced
        root.insertInOrder(-3); // Add 4 to make it unbalanced
        assertEquals(-1, QuestionImproved.checkHeight(root)); // How is the tree got created?


    }


    @Test
    public void testCheckHeighRightMinus35() throws Exception {
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
        root.insertInOrder(100); // Add 4 to make it unbalanced
        root.insertInOrder(200); // Add 4 to make it unbalanced
        root.insertInOrder(300); // Add 4 to make it unbalanced
        assertEquals(-1, QuestionImproved.checkHeight(root)); // How is the tree got created?
    }


    @Test
    public void checkHeigh6() throws Exception {
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
        root.print();
        assertEquals(4, QuestionImproved.checkHeight(root)); // How is the tree got created?
    }

    @Test
    public void testIsBalanced1() throws Exception {
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
        assertEquals(true, QuestionImproved.isBalanced(root)); // How is the tree got created?

    }


    @Test
    public void unBalance2() throws Exception {
        // Create balanced tree
        int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);// Create binary tree
        root.insertInOrder(-1); // Add 4 to make it unbalanced
        root.insertInOrder(-2); // Add 4 to make it unbalanced
        root.insertInOrder(-3); // Add 4 to make it unbalanced
        assertEquals(false, QuestionImproved.isBalanced(root));
    }


}