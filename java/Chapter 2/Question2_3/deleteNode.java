package Question2_3;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/17/2014.
 */
public class deleteNode {
    public static boolean deleteNode (LinkedListNode n) {
        // check null and next null
        if (n == null || n.next == null) {
            return false;
        }

        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;

    }


}
