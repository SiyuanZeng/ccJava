package CtCILibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by SiyuanZeng's on 4/18/2016.
 */
public class TreeNodeTest {

    @Test
    public void createMinimalBST1WhenEndIsLessThanStart() throws Exception {
        int[] array = {};
        assertNull(TreeNode.createMinimalBST(array));
    }


    @Test
    public void createMinimalBST1WhenThereIsOnlyOneNode() throws Exception {
        int[] array = {1, 2};
        assertEquals(2, TreeNode.createMinimalBST(array).size());
    }

    @Test
    public void createMinimalBST1WhenThereAreFullNodes() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        assertEquals(2, TreeNode.createMinimalBST(array).size());
    }

    @Test
    public void testSetLeftChild() throws Exception {

    }

    @Test
    public void testSetRightChild() throws Exception {

    }

    @Test
    public void testInsertInOrder() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testIsBST() throws Exception {

    }

    @Test
    public void testHeight() throws Exception {

    }

    @Test
    public void testFind() throws Exception {

    }


    @Test
    public void testPrint() throws Exception {

    }
}