package Question2_5;
import CtCILibrary.LinkedListNode;

public class ReverseLinkedList {

	public static LinkedListNode reverseLinkedList (LinkedListNode l1) {
		if(null == l1) return null;

		if (null == l1.next){
			l1.setPrevious(null);
			l1.last = l1;
			return l1;
		}

		LinkedListNode res = reverseLinkedList(l1.next);

		insertAfter(res, l1.data);
		return res;
	}

	public static LinkedListNode insertAfter(LinkedListNode list, int data) {
		LinkedListNode node = new LinkedListNode(data, null, null);
		if (list != null) {
			list.last.next = node;
			node.prev = list.last;
			node.last=node;
			list.last = node;
		}
		return node;
	}
	
}
