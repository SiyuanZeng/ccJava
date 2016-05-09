package LeetCode.RotateList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class RotateList {
        public LinkedListNode rotateRight(LinkedListNode head, int n) {
            if (head == null || n == 0)
                return head;
            LinkedListNode slow = head;
            LinkedListNode fast = head;
            while (n > 0) {
                n--;
                fast = fast.next;
                if (fast == null)
                    fast = head;
            }
            if (fast == null || slow == fast)
                return head;
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            LinkedListNode newHead = slow.next;
            slow.next = null; // The head doesn't have slow.next again.
            fast.next = head; // The fast half can now connect to the first half.
            return newHead;
    }
}
