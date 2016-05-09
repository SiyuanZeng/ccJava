package LeetCode.ReverseLinkedList;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 5/7/2016.
 */
public class ReverseLinkedList_DoubleLinked_RecursiveTest{
    @Test
    public void testReverseLinkedList() throws Exception {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        LinkedListNode clone = head.clone();

        assertEquals("0->1->2->3->4->5->6->7", head.printForward());
        assertEquals("7->6->5->4->3->2->1->0", ReverseLinkedList_DoubleLinked_Recursive.reverseLinkedList(head).printForward());
        assertEquals("7<-6<-5<-4<-3<-2<-1<-0", ReverseLinkedList_DoubleLinked_Recursive.reverseLinkedList(head).printBackward());
    }
}