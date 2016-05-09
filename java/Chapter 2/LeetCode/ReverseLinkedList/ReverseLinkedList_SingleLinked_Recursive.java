package LeetCode.ReverseLinkedList;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 5/5/2016.
 */
public class ReverseLinkedList_SingleLinked_Recursive {
    public static LinkedListNode reverseLinkedList(LinkedListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        // return the last one.
        // Node: the current one navigating from the previous one
        LinkedListNode remaining = reverseLinkedList(node.next);
        //Makek the next node of next pointing to the current one.

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        //1 -> 2 -> 3 -> 4 -> 5 <- 6
        //1 -> 2 -> 3 -> 4 <- 5 <- 6
        //1 -> 2 -> 3 <- 4 <- 5 <- 6
        //1 -> 2 <- 3 <- 4 <- 5 <- 6
        //1 <- 2 <- 3 <- 4 <- 5 <- 6

        node.next.next = node;
        //Make the current next equals null. Then return to the previous call.
        node.next = null;
        return remaining;
    }
}
