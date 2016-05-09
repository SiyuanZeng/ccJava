package Question2_4_Partition.practice._142_Part_05;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/3/2014.
 */
public class Partition {
    public static void main(String[] args) {
		/* Create linked list */
        int[] vals = {1, 3, 7, 5, 2, 9, 4, 9};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        System.out.println(head.printForward());

		/* Partition */
        LinkedListNode h = partition(head, 5);

		/* Print Result */
        System.out.println(h.printForward());
    }

    public static LinkedListNode partition(LinkedListNode head, int k) {
        if ( null == head) return null;


        LinkedListNode current = head;

        LinkedListNode befStart = null;
        LinkedListNode befEnd = null;
        LinkedListNode aftStart = null;
        LinkedListNode aftEnd = null;


        while (null != current) {
            LinkedListNode next = current.next;
            current.next = null;// Here should be current.next = null;

            if ( current.data >= k) { // equal sign
                if (null == aftStart) { // Should be ==
                    aftStart = current;
                    aftEnd = aftStart;
                } else {
                    aftEnd.next = current;
                    aftEnd = current; //Should add this line, move the end pointer
                }
            } else {
                if (null == befStart) {
                    befStart = current;
                    befEnd = befStart;
                } else {
                    befEnd.next = current;
                    befEnd = current; //Should add this line, move the end pointer
                }
            }


            current = next;
        }


        if (null == befStart) { // Should be ==
            return aftStart;
        } else {
            befEnd.next = aftStart;
        }
        return befStart;
    }


}
