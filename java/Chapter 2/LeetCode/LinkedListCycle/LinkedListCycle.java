package LeetCode.LinkedListCycle;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class LinkedListCycle {
    public boolean hasCycle(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }
}
