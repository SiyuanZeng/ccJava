package Interview0_3.SortedList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/5/2016.
 */
public class ReverseLinkedList_DoubleLinked_Recursive {
    public static LinkedListNode reverseLinkedList(LinkedListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LinkedListNode remaining = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }
}
