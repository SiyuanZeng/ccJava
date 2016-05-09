package Question2_1_DuplicateWordsInString;

/**
 * Created by SiyuanZeng's on 6/24/2014.
 */
public class MyNode <E> {
    MyNode next = null;// self - include
    MyNode previous = null;// self - include
    E data;

    public MyNode(E data) {
        this.data = data;
    }

    public MyNode(E data, MyNode next, MyNode previous) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    void appendToTail(E data) {
        MyNode end = new MyNode(data) ;
        MyNode n = this;
        while (null != n.next) {
            n = n.next;
        }
        n.next = end;
    }


    static MyNode deleteNode(int data, MyNode head) {
        MyNode n = head;

        // Current one, so that I don't have to worry about store the previous node.
        if ((Integer)n.data == data) {
            return head.next;
        }

        // iterate the list
        while (null != n.next) {
            // next one , point to next next one.
            if ((Integer)n.next.data == data) {
                n.next = n.next.next;// This is null already, but it return.
                return head;
            }
            // go to next one
            n = n.next;
        }

        // Can't find it
        return head;
    }
    static MyNode deleteNode(String data, MyNode head) {
        MyNode n = head;

        // Current one, so that I don't have to worry about store the previous node.
        if ((String)n.data == data) {
            return head.next;
        }

        // iterate the list
        while (null != n.next) {
            // next one , point to next next one.
            if (data.equals((String)n.next.data)) {
                n.next = n.next.next;// This is null already, but it return.
                return head;
            }
            // go to next one
            n = n.next;
        }

        // Can't find it
        return head;
    }
   static MyNode deleteAllNode(int data, MyNode head) {
        MyNode n = head;

        // Current one, so that I don't have to worry about store the previous node.
        if ((Integer)n.data == data) {
            head = head.next;
        }

        // iterate the list
        while (null != n.next) {
            // next one , point to next next one.
            if ((Integer)n.next.data == data) {
                n.next = n.next.next; // This is null already
            }
            // go to next one
            if(null != n.next ) n = n.next;
        }

        // Can't find it
        return head;
    }

    public String printForward() {
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return data.toString();
        }
    }

    public MyNode clone() {
        MyNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        MyNode head2 = new MyNode(data, next2, null);
        return head2;
    }


}
