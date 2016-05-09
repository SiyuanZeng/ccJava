package Question2_7_isPalindrome;

import CtCILibrary.LinkedListNode;

import java.util.Stack;

public class QuestionB {
	public static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode fast = head;
		LinkedListNode slow = head;


        // How to use stack?
		Stack<Integer> stack = new Stack<Integer>();


        //when the fast hit the last element or the one after last element.
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;			
		}
		
		/* Has odd number of elements, so skip the middle */
        // odd number, the fast will end at the last element
        // even number, the fast will end at the one after last element

		if (fast != null) { 
			slow = slow.next; // middle one.
		}

        // Compare top with stack.
        // Problem, can not see it, must think in the mind.
        // Here it only has slow data, because the slow and stack number are the same.
		while (slow != null) {
			int top = stack.pop().intValue();
			System.out.println(slow.data + " " + top);
			if (top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	


}
