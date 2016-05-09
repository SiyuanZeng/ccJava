package Question2_2_nthToLast;

import CtCILibrary.*;

public class Question {

	public static int size(LinkedListNode head) {
		int size = 0;
		while (null !=head){
			size++;
			head = head.next;
		}
		return size;
	}

	public static int nthToLastPrintOut(LinkedListNode head, int n) {
		if (n == 0 || head == null) {
			return 0;
		}
		int k = nthToLastPrintOut(head.next, n) + 1;//Go to last one, then return 1.
		if (k == n) {
			System.out.println(n + "th to last node is " + head.data);
		}
		return k;
	}


	public static LinkedListNode nthToLastWrapper(LinkedListNode head, int k) {
		if (head == null) {
			throw new IllegalArgumentException("The LinkedListNode should not be null");
		}

		if (k < 0 ){
			throw new IllegalArgumentException("The interger should be non-negative.");
		}

		return nthToLastWrapperHelper(head, k, new IntWrapper());

	}

	public static LinkedListNode nthToLastWrapperHelper(LinkedListNode head, int n, IntWrapper i) {
		if (head == null) {
			return null;
		}
		LinkedListNode node = nthToLastWrapperHelper(head.next, n, i);
		i.value = i.value + 1;
		if (i.value == n) {
			return head;
		} 
		return node;
	}
	
	public static Result nthToLastResultHelper(LinkedListNode head, int k) {
		if (head == null) {
			return new Result(null, 0);
		}
		Result res = nthToLastResultHelper(head.next, k);
		if (res.node == null) {// The count is not necessary, actually just pass an IntergerWapper is enough!
			res.count++;
			if (res.count == k) {
				res.node = head;
			}
		}
		return res;
	}

	public static LinkedListNode nthToLastResult(LinkedListNode head, int k) {
		Result res = nthToLastResultHelper(head, k);
		return null != res.node? res.node: null;
	}		
	
	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		if (n <= 0) return null;
		
		// Move p2 n nodes into the list.  Keep n1 in the same position.
		for (int i = 0; i < n - 1; i++) {
			if (p2 == null) {
				return null; // Error: list is too small.
			}
			p2 = p2.next;
		}
		if (p2 == null) { // Another error check.
			return null;
		}
		
		// Move them at the same pace.  When p2 hits the end, 
		// p1 will be at the right element.
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
	  	}
	  	return p1;
	}

}
