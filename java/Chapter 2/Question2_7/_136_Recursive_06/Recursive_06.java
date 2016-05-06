package Question2_7._136_Recursive_06;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/2/2014.
 */
class Result {
    LinkedListNode next;
    boolean result;

    public Result (LinkedListNode next, boolean result) {
        this.next = next;
        this.result = result;
    }
}


public class Recursive_06 {
    public static void main(String[] args) {
        int length = 10;
        LinkedListNode[] nodes = new LinkedListNode[length];
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
        Recursive_06 q = new Recursive_06();
        try {
            System.out.println(q.checkPalindrome(head));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Result isPalindrome(LinkedListNode head, int size) {
        if (size == 0) {
            return new Result(null, true);
        } else if (size == 1) {
            return new Result(head.next, true);
        } else if (size == 2) {
            return new Result(head.next.next, head.data == head.next.data);
        }

        Result res = isPalindrome(head.next, size -2);


        if ( !res.result || null == res.next ) {
            return res;
        } else {
            res.result = head.data == res.next.data;
            res.next = res.next.next;
            return res;
        }
    }


    public static boolean checkPalindrome ( LinkedListNode head) throws Exception {
        if ( null == head) throw new Exception("The linked list is empty");

        int len = length(head);

        Result res = isPalindrome(head, len);

        return res.result;
    }

    public static int length(LinkedListNode head) {
        if ( null == head) return 0;
        return 1 + length(head.next);
    }

}