package Question2_4;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/17/2014.
 */
public class a_partition {

    public LinkedListNode partition(LinkedListNode node,int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while (node != null) {

            if (node.data < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            LinkedListNode next = node;
            node.next = null;
            node = next;
        }

        if (beforeStart == null) {
            return  afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
