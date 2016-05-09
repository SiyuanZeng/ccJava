package Question2_0_DeleteNodeWithData;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class DeleteNodeNote {

/* Go to the end.
    while (null != n.next) {
        n = n.next;
    }
*/







/*

******************************* Move to next one and it is null **************************

    // iterate the list
    while (null != n.next) {
        // next one , point to next next one.
        if (n.next.data == data) {
            n.next = n.next.next; // This is null already
        }
        // go to next one
        if(null != n.next ) n = n.next;
    }

*/


/*******************************First node in the single-linked and Another case n.next***************************
 * 1. Because it can't delete the current node properly
 * 2. It delete one in the list, so it can't delete the last one. because the next.next will be null.
 * 1) Work on current node, can delte the current node properly when it is the last node
 *      while(null != n ) {}
 *      Last one will be the problem, because:
 *          n.data = n.next.data;
 *          n.next = n.next.next;
 *
 *      I have to keep 2 nodes at the same time.
 *          LinkedListNode previous = n;
 *          LinkedListNode current = n.next;
 *
 *
 * 2) Work on the next now, it can't delete the last one, becasue the next.next will be null.
 *      while (null != n.next )
 *
 *      The corner case is if (n.data != d && null != next && next.data==d && null==next.next).
 *
 *
 *
 *
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
*/





}
