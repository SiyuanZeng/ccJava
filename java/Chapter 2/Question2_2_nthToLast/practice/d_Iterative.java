package Question2_2_nthToLast.practice;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/16/2014.
 */
public class d_Iterative {

    // 2 LinkedListNode

    LinkedListNode nthToLast(LinkedListNode head, int k) {
        if (k <= 0) return null;
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        // Move p2 forward k nodes into the list
        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) return null; // Error check
            p2 = p2.next;
        }

        if (p2 == null) return null;

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}

