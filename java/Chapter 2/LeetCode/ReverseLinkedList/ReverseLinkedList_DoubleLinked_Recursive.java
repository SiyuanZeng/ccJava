package LeetCode.ReverseLinkedList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/5/2016.
 */
public class ReverseLinkedList_DoubleLinked_Recursive {
    public static LinkedListNode reverseLinkedList(LinkedListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        if (node.prev == null) {
            node.prev = node.next;
        }
        node.next.prev = node.next.next;

        LinkedListNode remaining = reverseLinkedList(node.next);
        node.next.next = node;

        node.next = null;
        return remaining;
    }
}
