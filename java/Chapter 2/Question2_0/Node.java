package Question2_0;

/**
 * Created by SiyuanZeng's on 6/11/2014.
 */
public class Node {
    // default, package private
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int d){
        //  find the last node and then append to its next.
        Node end = new Node(d);

        // Don't mess up the original one
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    // retuan the list after deleting the data.
    public Node deleteNode (Node head, int d){
        // if d is at the head
        // make a copy of head to iterate thought, but still keep the head for furture use.
        Node n = head;
        // if it is the first one.
        if (n.data == d){
            return head.next;
        }
        // if d is after the head
        while (n.next != null) {
            if (n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        // if the d is not in the list
        // return the head, the whole list.
        return head;
    }
}




