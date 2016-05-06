package Question2_7;

import CtCILibrary.LinkedListNode;

public class Question {
    private int position = 0;

    // inner class.
	public class Result {
		public LinkedListNode node;//next node of second half
		public boolean result;//compare current node
		public Result(LinkedListNode n, boolean res) {
			node = n;
			result = res;
		}
	}

    //starting point. head.
	public Question.Result isPalindromeRecurse(LinkedListNode head, int length) {
        // Why each line is hard to understand? Sequence.
        //What does each block mean?
        // Why is it written in this way?
        // Where is the length from?
        // Why there are 1, 2?
        // There is something I don't understand. I don't understand the flow. The flow is coming back and forth.
        // Goes to the middle
        // Recursive point
        // Goes to the next half.
        // Use the head data. The head data is always moving.
        // This is for null situation, when the method is initially called.
        // Don't understand the first intention.\
        System.out.println("Length " + length + "Position" + (++position));
        if (head == null || length == 0) {
			return new Question.Result(null, true);
		} else if (length == 1) {
			// this is the middle element, for example 3;
			return new Question.Result(head.next, true);
		} else if (length == 2) {
			// compare the last element.
            // this is the end.
            //
			return new Question.Result(head.next.next, head.data == head.next.data);
		}
		// Will this be negative? No because it will return. stop from the previous one.
        // This reasonates with the if condition.
        Question.Result res = isPalindromeRecurse(head.next, length - 2);
        // I am confused about the flow.
        // head.next, is the next head, which always move next to the end. it is returned.
        // head data is current data.
        // res.node.next is always moving to the end and return back to the previous level.
        // compare with last head with the first node after middle.
        // Do I really need this line? Because it may have an empty node at the end. Shouldn't it be non-null?
        // it can be null.
        // can I compare to null?
        // default value is true. So complicated.
        // How can I come up with this kind of solution?
        // if one place is false, then everything will be false. If it is just null, it will still be true.
		if (!res.result || res.node == null) {// If one thing is false, then the whole thing is false.
			return res; // Only "result" member is actually used in the call stack. this for the first if condition.
		} else {
            // Compare the last elment in the first half with the first element in the second half.
			res.result = head.data == res.node.data;
			res.node = res.node.next;// goes to the next node.// maybe true, and maybe false.
			return res;
		}
	}

    // the first lines, check the very simple condition.
    // then the recursive.
	
	public boolean isPalindrome(LinkedListNode head) {

		int size = 0;
		LinkedListNode n = head;
        // compute the size.
		while (n != null) {
			size++;
			n = n.next;
		}
        // Recurse here.
		Result p = isPalindromeRecurse(head, size);
		return p.result;
	}
	
	public static void main(String[] args) {
		int length = 10;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}
		
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		// nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		Question q = new Question();
		System.out.println(q.isPalindrome(head));
	}

}
