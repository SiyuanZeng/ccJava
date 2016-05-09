package LeetCode.InsertionSortList;

/**
 * Created by SiyuanZeng's on 5/8/2016.
 */
public class InsertionSortedListNote {

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(head.val);
        ListNode runner = head.next;
        while (runner != null) {
            // The current is to compare every element in the list.

            ListNode current = newHead;
            ListNode next = runner.next;
            if (runner.val <= newHead.val) {
                ListNode oldHead = newHead;
                newHead = runner;
                newHead.next = oldHead;
            } else {
                while (current.next != null) {
                    if (runner.val > current.val && runner.val <= current.next.val) {
                        ListNode oldNext = current.next;
                        current.next = runner;
                        runner.next = oldNext;
                    }
                    current = current.next;
                }
                if (current.next == null && runner.val > current.val) {
                    current.next = runner;
                    runner.next = null;
                }
            }
            runner = next;
        }
        return newHead;
    }
}
