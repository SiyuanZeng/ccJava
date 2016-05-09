package Question2_0_DeleteNodeWithData;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 6/11/2014.
 */
public class AppendAndDeleteData_SingleLinked{
    // default, package private

    public static void appendToTail(LinkedListNode node, int d){
        //  find the last node and then append to its next.
        LinkedListNode end = new LinkedListNode(d, null, null);

        // Don't mess up the original one
        while(node.next != null){
            node = node.next;
        }
        node.next = end;
    }

    // retuan the list after deleting the data.
    public static LinkedListNode deleteNode (LinkedListNode head, int d){
        // if d is at the head
        // make a copy of head to iterate thought, but still keep the head for furture use.
        LinkedListNode n = head;
        // if it is the first one. Why do we have to single out the starting node?


/*************************Solution 1 ***************************************

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

/*************************Solution 2 **************************************
        while(null != n ){
            LinkedListNode next = n.next;
            if (n.data == d && null != next){
                n.data = n.next.data;
                n.next = n.next.next;
                return head;
            }
            // last one
            if (n.data != d && null != next && null==next.next){
                n.next = null;
                return head;
            }
            n = n.next;
        }
 */


/*************************Solution 3 - Delete all the value***************************************/
        while(null != n ){
            LinkedListNode next = n.next;
            if (n.data == d && null != next){
                n.data = n.next.data;
                n.next = n.next.next;
            }
            // last one
            if (n.data != d && null != next && next.data==d && null==next.next){
                n.next = null;
                return head;
            }
            n = n.next;
        }















        // if the d is not in the list
        // return the head, the whole list.
        return head;
    }
}




