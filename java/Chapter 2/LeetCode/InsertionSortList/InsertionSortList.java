package LeetCode.InsertionSortList;

/**s
 * Created by SiyuanZeng's on 5/8/2016.
 */

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class InsertionSortList {
        public static ListNode insertionSortList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode newList = new ListNode(head.val);
            ListNode current = head.next;
            // loop through each element in the list
            while (current != null) { // This one is changed at the end.
                // insert this element to the new list
                ListNode iterateRunner = newList;
                // What is iterateRunner to newList?
                ListNode next = current.next;// For the last step
                if (current.val <= newList.val) { // How to connect this one?
                    ListNode oldHead = newList;
                    // insert the current into LinkedList
                    newList = current;// new head is moving.
                    // Working on nodes
                    // Have to detach it
                    newList.next = oldHead;
                } else { // current > newList
                    // What is the iterateRunner? newList.
                    // What is current? Head current, next
                    // * hard to visualize this
                    // What is oldNext? It is new
                    while (iterateRunner.next != null) { // iterateRunner start from the head. Why did I miss this? Then the current is to compare every element.
                        if (current.val > iterateRunner.val && current.val <= iterateRunner.next.val) {
                            ListNode oldNext = iterateRunner.next;// What is oldNext?
                            iterateRunner.next = current;
                            current.next = oldNext;
                        }// There is only one point. Then it goes to the end.
                        iterateRunner = iterateRunner.next;
                    }
                    // Why this? Last element
                    if (iterateRunner.next == null && current.val > iterateRunner.val) {
                        iterateRunner.next = current;
                        current.next = null;
                    }
                }
                // finally
                current = next;
            }
            return newList;
        }


        public static void printList(ListNode x) {
            if(x != null){
                System.out.print(x.val + " ");
                while (x.next != null) {
                    System.out.print(x.next.val + " ");
                    x = x.next;
                }
                System.out.println();
            }

        }
    }
