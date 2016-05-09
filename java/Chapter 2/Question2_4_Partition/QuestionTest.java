package Question2_4_Partition;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SiyuanZeng's on 4/28/2016.
 */
public class QuestionTest {

    @Test
    public void testPartition() throws Exception {
        //* Create linked list *//
        int[] vals = {1, 5, 5, 3, 7, 5, 2, 9, 4, 9};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

        //* Partition *//
        LinkedListNode h = Question.partition(head, 5);

        //* Print Result *//
        assertEquals("1->3->2->4->5->5->5->7->9->9", h.printForward());
    }

}