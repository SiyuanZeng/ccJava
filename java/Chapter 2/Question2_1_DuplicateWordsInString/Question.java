package Question2_1_DuplicateWordsInString;

import CtCILibrary.LinkedListNode;

import java.util.Hashtable;

public class Question {
	public static int tapB = 0;
	public static int tapC = 0;
	
	public static void tap(int i) {
		if (i == 0) {
			tapB++;
		} else {
			tapC++;
		}
	}

	public static LinkedListNode deleteDupsA(LinkedListNode n) {
		Hashtable table = new Hashtable();
/*		LinkedListNode previous = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}*/
        LinkedListNode node = n;
        if (node  != null){
            table.put (node.data, true);
        }
        while(node.next != null){
            if (table.containsKey (node.next.data)){
                node.next = node.next.next;
            }else{
                table.put (node.next.data, true);
                node = node.next;
            }
//            node = node.next;// I skip one
        }
        return n;
	}

	//todo hashQueue




	/*Current changes on the go*/
	/*What are the differences?*/
	public static LinkedListNode deleteDupsC(LinkedListNode head) {

		// runner - from first to the current.
		// current - to check whether it is duplicate
		// previous - to delete current

		if (head == null) return null;

		// prevoius is the head list
		// current, don't have first node
		// current move the 3rd node
		// previous, first node and skip the second node.

		// current starts from the second node
		LinkedListNode previous = head;
		LinkedListNode current = previous.next;// without the first node

		// Set the variable
		// current starts from the second node
		// previous starts from the head
		// moving current --> end
		// runner starts fromt head every time --> current .
		// if it finds duplicate
		// It delete the currrent
		// delete current
		// point previous to a new one.
		// if it doesn't find duplicate
		// move current
		// move previous to the current one.
		while (current != null) {
			// Look backwards for dups, and remove any that you see.
			LinkedListNode runner = head;// From the first one, find the duplicate, then stop, go to next current node.
			while (runner != current) { // ? go to the end? runner keep changing What does this line mean ? Without this line, every line will be the same.
				tap(1);
				if (runner.data == current.data) { //
					previous.next = current.next; // save the node after current in previous.next
					current = current.next; //move to next element. these 2 always start at the same place.
					/* We know we can�t have more than one dup preceding
					 * our element since it would have been removed
					 * earlier. */
					break; // break on the found same value.
				}
				runner = runner.next;
			}

			/* If runner == current, then we didn�t find any duplicate
			 * elements in the previous for loop.  We then need to
			 * increment current.
			 *
			 * If runner != current, then we must have hit the �break�
			 * condition, in which case we found a dup and current has
			 * already been incremented.*/
			if (runner == current) {
				previous = current;
				current = current.next;
			}
		}
		return head;

	}

	/*Current stay the same*/

	public static LinkedListNode deleteDupsB(LinkedListNode head) {
		if (head == null) return null;
		// This is like insertion
		LinkedListNode current = head;
		while (current != null) { // This one will get through everything.
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) { 
				tap(0);
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return head;
	}	
	
}
