package CtCILibrary;

public class LinkedListNode {
	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode last;
	public int data;
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
		data = d;
		setNext(n);
		setPrevious(p);
	}
	
	public LinkedListNode() { }

	public void setNext(LinkedListNode n) {
		next = n;
		if (this == last) {
			last = n;
		}
		if (n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}
	
	public void setPrevious(LinkedListNode p) {
		prev = p;
		if (p != null && p.next != this) {
			p.setNext(this);
		}
	}	
	
	public String printForward() {
		if (next != null) {
			return data + "->" + next.printForward();
		} else {
			return ((Integer) data).toString();
		}
	}
	
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if (next != null) {
			next2 = next.clone();
		}
		LinkedListNode head2 = new LinkedListNode(data, next2, null);
		return head2;
	}

	@Override
	public boolean equals(Object o) {

		// If the object is compared with itself then return true
		if (o == this) {
			return true;
		}

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
		if (!(o instanceof LinkedListNode)) {
			return false;
		}

		// typecast o to Complex so that we can compare data members
		LinkedListNode c = (LinkedListNode) o;

		// Compare the data members and return accordingly

		if (data != c.data) {
			return false;
		}

		while (null != next && null != c.next) {
			if (Integer.compare(next.data, c.next.data) != 0) {
				return false;
			}
			next= next.next;
			c.next = c.next.next;
		}


		return true;
	}
}
