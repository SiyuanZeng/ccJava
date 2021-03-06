package Question2_5_Addition;
import CtCILibrary.LinkedListNode;

public class QuestionB {
	private static int length(LinkedListNode l) {
		if (l == null) {
			return 0;
		} else {
			return 1 + length(l.next);
		}
	}
	
	private static PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {
		if (l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		PartialSum sum = addListsHelper(l1.next, l2.next);
		int val = sum.carry + l1.data + l2.data;
        //insertBefore
		LinkedListNode full_result = insertBefore(sum.sumNode, val % 10);
		sum.sumNode = full_result;
		sum.carry = val / 10;
		return sum;
	}

	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {

        //compare list
        int len1 = length(l1);
		int len2 = length(l2);


		if (len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}

		PartialSum sum = addListsHelper(l1, l2);
		if (sum.carry == 0) {
			return sum.sumNode;
		} else {
			LinkedListNode result = insertBefore(sum.sumNode, sum.carry);
			return result;
		}
	}	
	
	private static LinkedListNode padList(LinkedListNode l, int padding) {
		LinkedListNode head = l;
		for (int i = 0; i < padding; i++) {
			LinkedListNode n = new LinkedListNode(0, null, null);
			head.prev = n;
			n.next = head;//padding
			head = n;// change head
		}
		return head;
	}
	
	private static LinkedListNode insertBefore(LinkedListNode list, int data) {
		LinkedListNode node = new LinkedListNode(data, null, null);
		if (list != null) {
			list.prev = node;
			node.next = list;
		}
		return node;
	}
	
	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		while (node != null) {
			value = value * 10 + node.data;
			node = node.next;
		}
		return value;
	}	
	
	public static void main(String[] args) {

	}
}
