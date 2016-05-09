package Question2_2_nthToLast.practice;

import CtCILibrary.LinkedListNode;
import Question2_2_nthToLast.IntWrapper;

/**
 * Created by SiyuanZeng's on 6/16/2014.
 */
public class c_Wrapper {

    public LinkedListNode nthToLastR2(LinkedListNode head, int k, IntWrapper i) {
        // check null to stop calling
        if (head == null){
            return null;
        }

        // locate the node,
        LinkedListNode node = nthToLastR2(head.next, k, i);
        i.value = i.value + 1;
        if(i.value ==k ) return head;

        // return the node
        return node;

    }
}
