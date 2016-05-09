package LeetCode.OddEvenLinkedList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class OddEvenLinkedList {
    public class Solution {
        public LinkedListNode oddEvenList(LinkedListNode head) {
            if (head == null) return head;
            LinkedListNode p = head, q =head;
            while (q != null) {
                q = q.next;
                if (q==null || q.next==null) break;
                LinkedListNode next_p = p.next, next_q = q.next;
                q.next = next_q.next;
                p.next = next_q;
                next_q.next = next_p;
                p = p.next;
            }
            return head;
        }
    }
}
