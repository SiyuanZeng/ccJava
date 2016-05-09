package LeetCode.MergeKSortedList;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class MergeKSortedListTest {

    @Test
    public void testMergeKLists() throws Exception {
        ArrayList<LinkedListNode> lists = new ArrayList<LinkedListNode>();

        LinkedListNode first = new LinkedListNode(1, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 2; i < 8; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        lists.add(head);


        first = new LinkedListNode(2, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        head = first;
        second = first;
        for (int i = 4; i < 8; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        lists.add(head);


        first = new LinkedListNode(8, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        head = first;
        second = first;
        for (int i = 9; i < 13; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        lists.add(head);

        assertEquals("1->2->2->3->4->4->5->5->6->6->7->7->8->9->10->11->12", MergeKSortedList.mergeKLists(lists).printForward());





















    }
}