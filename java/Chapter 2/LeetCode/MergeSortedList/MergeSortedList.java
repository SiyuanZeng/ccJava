package LeetCode.MergeSortedList;

import CtCILibrary.LinkedListNode;

/**
 * Definition for singly-linked list.
 * public class LinkedListNode {
 * int val;
 * LinkedListNode next;
 * LinkedListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class MergeSortedList {
    public LinkedListNode mergeTwoLists(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode p1 = l1;
        LinkedListNode p2 = l2;

        LinkedListNode fakeHead = new LinkedListNode(0, null, null);
        LinkedListNode p = fakeHead;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                // Will this carray afterward nodes? It will change the node afterwards. After this it will inser whole linkedList

                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        if (p1 != null)
            p.next = p1;
        if (p2 != null)
            p.next = p2;

        return fakeHead.next;
    }
}