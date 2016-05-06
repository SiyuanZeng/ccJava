package Question2_3;

import CtCILibrary.LinkedListNode;

public class Question {

	public static boolean deleteCurrentNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false; // Failure
		} 
		LinkedListNode next = n.next; 
		n.data = next.data; 
		n.next = next.next; 
		return true;
	}

	public static boolean deleteNodeByNum(LinkedListNode n, int num) {
		if (n == null || n.next == null) { //Why n.next should be null?
			return false; // Failure
		}

		LinkedListNode next = null;

		// Find the node to delete
		//
		for (int i = 0; i < num; i++) {
			if (null != n.next) {
				n = n.next;
			} else {
				System.out.print("Here it is");
				return false;
			}
		}

		// Delete the current one
		// Can I combine this ?
		if (null != n.next) {
			next = n.next;
		} else {
			return false;
		}

		// n > next > next.next
		if (null != next) {
			n.next = next.next;
			n.data = next.data;
		} else {
			n.next = null;
		}

		//next.next.setPrevious(n);
		return true;
	}
}
