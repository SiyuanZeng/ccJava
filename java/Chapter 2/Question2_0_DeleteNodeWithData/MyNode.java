package Question2_0_DeleteNodeWithData;

/**
 * Created by SiyuanZeng's on 6/24/2014.
 */
public class MyNode {
    MyNode next = null;// self - include
    MyNode previous = null;// self - include
    int data;

    public MyNode() {
    }



    public MyNode(MyNode next) {
        this.next = next;
    }

    public MyNode(MyNode next, MyNode previous, int data) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public MyNode(int data) {
        this.data = data;
    }

    public MyNode(int data, MyNode next, MyNode previous ) {
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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
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
        if (n.data == data) {
            return head.next;
        }// iterate the list

        while (null != n.next) {// next one , point to next next one.
            if (n.next.data == data) {
                n.next = n.next.next;// This is null already, but it return.
                return head;
            }// go to next one
            n = n.next;
        }// Can't find it

        return head;
    }

   static MyNode deleteAllNode(int data, MyNode head) {
        MyNode n = head;
        // Current one, so that I don't have to worry about store the previous node.
        if (n.data == data) {
            head = head.next;
        }

        // iterate the list
        while (null != n.next) {
            // next one , point to next next one.
            if (n.next.data == data) {
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
            return ((Integer) data).toString();
        }
    }

    public MyNode clone() {
        MyNode next2 = this;
        if (next != null) {
            next2.next = next.clone();
        }
        return next2;
    }

}









































