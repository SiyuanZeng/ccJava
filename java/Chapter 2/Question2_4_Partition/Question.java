package Question2_4_Partition;

import CtCILibrary.LinkedListNode;

public class Question {
    /*
    partition
    onion-copy
    2 linked list 4 nodes
    add no-associate-next node
    initial node
    move and point
    merge
    */

	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;

		LinkedListNode equalStart = null;
		LinkedListNode equalEnd = null;

		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;

		/* Partition list */
		while (node != null) {
            LinkedListNode next = node.next;// Next node, use to assign to the node, to move to next one.
            //node.next = null; //Delete? can't delete this. assign to before end. It will only copy the current one.
			if (node.data < x) {
                // set the start
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
                // add to end, and point.
					beforeEnd.next = node;
					// this is previous before end ( node -1), current node, the next one is next node.
					beforeEnd = node;
					// added node, so that I can execute the above line, the node is node.next.
                    // these 2 line change back and forth.
				}
			} else if (node.data == x){
				if (equalStart == null) {
					equalStart = node;
					equalEnd = equalStart;
				} else {
					equalEnd.next = node;
					equalEnd = node;
				}
			} else {
                // set the start
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
                    // add to the end
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		/* Merge before list and after list */

		if (afterStart == null) {
			if (null == equalStart ){
				return beforeStart;
			} else {
				if (null == beforeStart) {
					return equalStart;
				} else {
					beforeEnd.next = equalStart;
					return beforeStart;
				}
			}
		} else {
			if (null == equalStart ){
				if (null == beforeStart){
					return afterStart;
				} else {
					beforeEnd.next = afterStart;
					return beforeStart;
				}
			} else {
				equalEnd.next=afterStart;
				if (null == beforeStart) {
					return equalStart;
				} else {
					beforeEnd.next = equalStart;
					return beforeStart;
				}
			}
		}





	}
	


}
