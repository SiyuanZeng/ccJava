package LeetCode.Traversal.BasicTraversal_StackBased;

import CtCILibrary.TreeNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/18/2016.
 */
public class InOrderTraversalTest {

    @Test
    public void testInorderTraversal() throws Exception {

    }

    @Test
    public void testInorderTraversal_Recursive() throws Exception {

    }

    @Test
    public void testInorderTraversal3_Simple() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // We needed this code for other files, so check out the code in the library
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("Root? " + root.data);
        System.out.println("Created BST? " + root.isBST());
        System.out.println("Height: " + root.height());

        System.out.println(InOrderTraversal.inorderTraversal3_Simple(root));


    }
}