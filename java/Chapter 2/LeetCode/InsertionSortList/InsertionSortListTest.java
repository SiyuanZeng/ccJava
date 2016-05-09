package LeetCode.InsertionSortList;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class InsertionSortListTest {

    @Test
    public void testInsertionSortList() throws Exception {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);

        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        n1 = InsertionSortList.insertionSortList(n1);

        InsertionSortList.printList(n1);

    }
}