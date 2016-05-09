package LeetCode.ReverseLinkedList;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/7/2016.
 */

public class ReverseLinkedList_SingleLinked_RecursiveTest{
    @Test
    public void testReverseLinkedList() throws Exception {
        // Creating a linked list

        LinkedListNode head=new LinkedListNode(0, null, null);
        LinkedListNode move = head;
        move.next=new LinkedListNode(1, null, null);
        move = move.next;
        move.next=new LinkedListNode(2, null, null);
        move = move.next;
        move.next=new LinkedListNode(3, null, null);
        move = move.next;
        move.next=new LinkedListNode(4, null, null);
        move = move.next;
        move.next=new LinkedListNode(5, null, null);
        move = move.next;
        move.next=new LinkedListNode(6, null, null);

        System.out.println(head.printForward());
        //Reversing LinkedList

        LinkedListNode reverseHead=ReverseLinkedList_SingleLinked_Recursive.reverseLinkedList(head);
        System.out.println("After reversing");
        System.out.println(reverseHead.printForward());

    }
}