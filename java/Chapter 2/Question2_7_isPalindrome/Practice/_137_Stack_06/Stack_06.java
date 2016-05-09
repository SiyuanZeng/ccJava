package Question2_7_isPalindrome.Practice._137_Stack_06;

import CtCILibrary.LinkedListNode;

import java.util.Stack;

/**
 * Created by SiyuanZeng's on 9/2/2014.
 */
public class Stack_06 {
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
        nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        Stack<Integer> stack = new Stack<Integer>();

        while (null != fast && null != fast.next) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        // I have a doubt here.
        if ( null != fast ) {
            slow = slow.next;
        }


        while ( null != slow) {
            int value = stack.pop().intValue();
            if (value != slow.data) return false;
            slow = slow.next;
        }

        return true;
    }


}
