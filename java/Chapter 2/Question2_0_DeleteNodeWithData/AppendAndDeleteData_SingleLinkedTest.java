package Question2_0_DeleteNodeWithData;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class AppendAndDeleteData_SingleLinkedTest {

    @Test
    public void appendToTail() throws Exception {

    }

    @Test
    public void deleteLinkedListNode() throws Exception {
        //* Create linked list *//
        LinkedListNode root = new LinkedListNode(0, null, null);
        LinkedListNode head = root;
        LinkedListNode current = head;
        for (int i = 1; i <= 9; i++) {
            current = new LinkedListNode(i, null, null);
            head.next = current;
            head = head.next;
        }

        for (int i = 0; i <= 9; i++) {
            current = new LinkedListNode(i, null, null);
            head.next = current;
            head = head.next;
        }

        System.out.println(AppendAndDeleteData_SingleLinked.deleteNode(root, 0).printForward());


    }
}