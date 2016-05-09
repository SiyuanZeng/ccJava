package Question2_5_Addition.Practice;

import CtCILibrary.LinkedListNode;
import Question2_5_Addition.PartialSum;

/**
 * Created by SiyuanZeng's on 6/18/2014.
 */


/*
stringBufferReverse order: 1's digit at the end
* length
* padding
* addListsHelper
* insertBefore
*
* */
public class b_forwardOrder {


    private static LinkedListNode padList(LinkedListNode l, int padding) {
        LinkedListNode head = l;

        for (int i = 0; i < padding; i++) {
            LinkedListNode n = new LinkedListNode(0, null, null);
            head.prev = n;
            n.next = head;
            head = n;
        }
        return head;
    }

    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        int len1 = length(l1);
        int len2 = length(l2);

        if (len1 < len2) {
            l1 = padList(l1, len2 - len1);
        } else {
            l2 = padList(l2, len1 - len2);
        }

        PartialSum sum = addListHelper(l1, l2);

        if (sum.carry == 0) {
            return sum.sumNode;
        } else {
            LinkedListNode result = insertBefore(sum.sumNode, sum.carry);
            return result;
        }
    }

    public static PartialSum addListHelper(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null && l2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }

        PartialSum sum = null;
        int val = 0;
        if (null != l1 && null != l2 ) {
            sum = addListHelper(l1.next, l2.next);
            val = sum.carry + l1.data + l2.data;
        } else if (null != l1 && null == l2 ) {
            sum = addListHelper(l1.next, null);
            val = sum.carry + l1.data;
        } else if (null == l1 && null != l2 ) {
            sum = addListHelper(null, l2.next);
            val = sum.carry + l2.data;
        }

        LinkedListNode full_result = insertBefore(sum.sumNode, val % 10);

        sum.sumNode = full_result;
        sum.carry = val/10;
        return sum;

    }


    public static LinkedListNode insertBefore(LinkedListNode list, int data) {
        LinkedListNode node = new LinkedListNode(data, null, null);
        if (list != null) {
            list.prev = node;
            node.next = list;
        }
        return node;
    }

    int length(LinkedListNode linkedListNode) {
        if (linkedListNode == null) {
            return 0;
        } else {
            return 1 + length(linkedListNode.next);
        }
    }


}
