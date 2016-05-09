package Question2_7_isPalindrome.Practice._153;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/6/2014.
 */

class Result {
    public boolean res;
    public LinkedListNode next;

    public Result (LinkedListNode next, boolean res) {
        this.next = next;
        this.res = res;
    }

}

public class Recursive {
    public static Result isPalindrome(LinkedListNode head, int size) {
        if (size == 0) {
            return new Result(null, true);
        } else if (size == 1) {
            return new Result(head.next, true);
        } else if  (size == 2) {
            return new Result(head.next.next, head.data == head.next.data);
        }

        Result res = isPalindrome(head.next, size -2);

        if (null == res.next && ! res.res ) {
            return res;
        } else {
            res.res = head.data == res.next.data;
            res.next = res.next.next;
            return res;
        }
    }




    public static boolean checkPalinDrome (LinkedListNode head) throws Exception {
        if (null == head) throw new Exception("The linked list is empty");
        int len = length(head);
        Result res = isPalindrome(head, len);
        return res.res;
    }

    public static int length(LinkedListNode head) {
        if (null == head) return 0;
        return 1 + length(head.next);
    }

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
        Recursive q = new Recursive();
        try {
            System.out.println(q.checkPalinDrome(head));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
