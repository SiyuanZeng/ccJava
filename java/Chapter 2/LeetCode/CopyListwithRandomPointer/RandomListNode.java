package LeetCode.CopyListwithRandomPointer;

public class RandomListNode {
	public RandomListNode next;
	public RandomListNode prev;
	public RandomListNode last;
	public RandomListNode random;
	public int data;
	public int label;
	public RandomListNode(int d, RandomListNode n, RandomListNode p) {
		data = d;
		setNext(n);
		setPrevious(p);
	}

	public RandomListNode() { }

	public void setNext(RandomListNode n) {
		next = n;
		if (this == last) {
			last = n;
		}
		if (n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}
	
	public void setPrevious(RandomListNode p) {
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

	public String printBackward() {
		if (prev != null) {
			return prev.printBackward() + "<-" + data ;
		} else {
			return ((Integer) data).toString();
		}
	}
	
	public RandomListNode clone() {
		RandomListNode next2 = null;
		if (next != null) {
			next2 = next.clone();
		}
		RandomListNode head2 = new RandomListNode(data, next2, null);
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
		if (!(o instanceof RandomListNode)) {
			return false;
		}

		// typecast o to Complex so that we can compare data members
		RandomListNode c = (RandomListNode) o;

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
