package Question2_6;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/21/2014.
 */

public class Practice {
    static LinkedListNode FindBeginning(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }

    public static void main(String[] args) {
        int loop_length = 100;
        int k = 10;

        LinkedListNode[] nodes = new LinkedListNode[loop_length];

        for (int i = 0; i < loop_length; i++) {
            nodes[i]  = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }

        nodes[loop_length - 1] = nodes[loop_length - k];

        LinkedListNode loop = FindBeginning(nodes[0]);

        if (loop == null) {
            System.out.println("No Cycle");
        } else {
            System.out.println(loop.data);
        }

    }







}
