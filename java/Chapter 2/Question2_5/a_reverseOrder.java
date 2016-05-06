package Question2_5;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/18/2014.
 */



/*

mode
forward order: 1's digit at the beginning
recursive




*/
public class a_reverseOrder {

    LinkedListNode addLists (LinkedListNode l1, LinkedListNode l2, int carry) {
        //1. check null
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        LinkedListNode result = new LinkedListNode(carry, null, null);

        //Add value, and the data from l1 and l2
        int value = carry;
        if (null != l1) {
            value += l1.data;
        }

        if (null != l2) {
            value += l2.data;
        }

        result.data = value % 10;// second difit of number

        if (null != l1 || null != l2 || value >= 10) {
            LinkedListNode more = addLists(null == l1 ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1:0);
            result.setNext(more);
        }
        return result;
    }
}
