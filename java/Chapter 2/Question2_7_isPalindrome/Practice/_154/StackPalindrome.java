package Question2_7_isPalindrome.Practice._154;

import CtCILibrary.LinkedListNode;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 9/6/2014.
 */
public class StackPalindrome {

    public static boolean isPalindrome(LinkedListNode head) throws Exception {
        if (null == head) {
            throw new Exception(" The exception is empty");
        }

        Stack<Integer> stack = new Stack<Integer>();


        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while ( null != fast && null != fast.next) {
            stack.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
        }

        if (null != fast) {
            slow = slow.next;
        }

        while (null != slow) {
            if (slow.data != stack.pop().intValue()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {

        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];

        // data
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
       // nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        try {
            System.out.println(isPalindrome(head));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
