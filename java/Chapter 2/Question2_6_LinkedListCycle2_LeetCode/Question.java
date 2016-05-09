package Question2_6_LinkedListCycle2_LeetCode;

import CtCILibrary.LinkedListNode;

public class Question {

	public static LinkedListNode FindBeginning(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		// Find meeting point
		while (null != fast && null != fast.next) {
			slow = slow.next; 
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		// Why do we need this? if there is some information wrong, then it is so hard to understand and study it will only waste too much time.
		// In the previous code, it can be break, or null.
        // so the following code make sure that it is break.
		// Error check - there is no meeting point, and therefore no loop, enhance the loop condition. Last step.
		if (fast == null || fast.next == null) {
			return null;
		}
		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps
		/* from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start. */
		slow = head; 
		while (slow != fast) { 
			slow = slow.next; 
			fast = fast.next; 
		}
		// Both now point to the start of the loop.
		return fast;
	}
}
