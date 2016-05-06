package Question4_1_BalancedTree;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SiyuanZeng's on 4/18/2016.
 */
public class QuestionBruteTest {

    @Test
    public void nullTree() throws Exception {
        int[] array = null;
        TreeNode root = null;
        assert(QuestionBrute.isBalanced(root));

    }

    @Test
    public void shouldGet0GetHeight1() throws Exception {
        // Create balanced tree
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("Root? " + root.data);
        assert(QuestionBrute.isBalanced(root));

    }

    @Test
    public void shouldGetMaxGetHeight2() throws Exception {
        TreeNode unbalanced = new TreeNode(10);
        for (int i = 0; i < 10; i++) {
            unbalanced.insertInOrder(AssortedMethods.randomIntInRange(0, 100));
        }
        System.out.println("Root? " + unbalanced.data);
        assert(!QuestionBrute.isBalanced(unbalanced));
    }

    @Test
    public void shouldGet0Height3() throws Exception {
        assertEquals(0, QuestionBrute.getHeight(null));
    }


    @Test
    public void shouldGet3Height4() throws Exception {
        TreeNode node1= new TreeNode(10);
        TreeNode node2= new TreeNode(10);
        TreeNode node3= new TreeNode(10);
        node1.setLeftChild(node2);
        node2.setLeftChild(node3);
        assertEquals(3, QuestionBrute.getHeight(node1));
    }

    @Test
    public void shouldGet3HeightFromUnbalanceTree() throws Exception {
        TreeNode node1= new TreeNode(10);
        TreeNode node2= new TreeNode(10);
        TreeNode node3= new TreeNode(10);
        TreeNode node4= new TreeNode(10);
        node1.setLeftChild(node2);
        node2.setLeftChild(node3);
        node1.setRightChild(node2);
        node2.setRightChild(node3);
        node3.setRightChild(node4);
        assertEquals(4, QuestionBrute.getHeight(node1));
    }
}