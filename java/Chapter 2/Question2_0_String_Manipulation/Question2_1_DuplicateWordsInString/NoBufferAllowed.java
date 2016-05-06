package Question2_0_String_Manipulation.Question2_1_DuplicateWordsInString;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/16/2014.
 */
public class NoBufferAllowed {
    // 2 pointers
    // check null
    //loop all.
        // runner check with current
        // if equall, then skip the runner to next one
        // else next element
        // runner > head
    // head move to next one.

    public static void deleteDups(LinkedListNode head) {
        if (head == null) return;
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode runner = current;

            while (runner.next != null) {

                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}

