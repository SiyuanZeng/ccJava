package Question2_0_DeleteNodeWithData;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class AppendAndDeleteData_DoubleLinkedTest {

    @Test
    public void testAppendToTail() throws Exception {

    }

    @Test
    public void testDeleteNode() throws Exception {
        //* Create linked list *//
        LinkedListNode root = new LinkedListNode(0, null, null);
        LinkedListNode head = root;
        for (int i = 1; i <= 9; i++) {
            LinkedListNode current = new LinkedListNode(i, null, null);
            head.next = current;
            current.prev = head;
            head = current;
        }

        System.out.println(AppendAndDeleteData_DoubleLinked.deleteNode(root, 2).printForward());

    }
}