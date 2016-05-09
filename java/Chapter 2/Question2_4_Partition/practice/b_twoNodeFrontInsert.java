package Question2_4_Partition.practice;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/18/2014.
 */
public class b_twoNodeFrontInsert {

    public LinkedListNode partition (LinkedListNode node, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode afterStart = null;

        while (null != node) {
            LinkedListNode next = node.next;
            if (node.data < x) {
                node.next = beforeStart; // null, first element. next, is the first element.
                // beforeEnd.next = node; difference
                //node.next = null; //Delete? can't delete this. assign to before end. It will only copy the current one.

                beforeStart = node; //  first element
            } else {
                node.next = afterStart;
                afterStart = node;
            }
            node = next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        LinkedListNode head = beforeStart;
        while (null != beforeStart.next) {
            beforeStart = beforeStart.next; // end of beforeLIst
        }
        beforeStart.next = afterStart;
        return head;
    }
}
