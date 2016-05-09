package Question2_5_Addition.Practice;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 8/31/2014.
 */
public class b_forwardOrder0 {


    private static LinkedListNode pad(LinkedListNode l, int padding) {
        LinkedListNode head = l;

        for (int i = 0; i < padding; i++) {
            LinkedListNode n = new LinkedListNode(0, null, null);
            head.prev = n;
            n.next = head;
            head = n;
        }

        return head;
    }


    public static LinkedListNode addHelper(LinkedListNode a, LinkedListNode b) {
        int lenA = length(a);
        int lenB = length(b);

        if (lenA > lenB) {
            b = pad(b, lenA - lenB);
        }

        if (lenB > lenA) {
            a = pad(a, lenB - lenA);
        }

        LinkedListNode carry = new LinkedListNode();

        LinkedListNode result = new LinkedListNode();

        if ( null != a && null != b) {
            result = plus(a, b, carry);
        }

        return result;
    }


    private static int length(LinkedListNode a) {
        if (null != a) {
            return 0;
        } else {
            return (1 + length(a));
        }
    }


    public static LinkedListNode plus(LinkedListNode a, LinkedListNode b, LinkedListNode carry) {
        LinkedListNode current = new LinkedListNode();
        int sum = 0;

        if (null != a || null != b) {
            LinkedListNode more = plus(
                    null == a? null: a.next,
                    null == b? null: b.next,
                    carry
            );
            if(null != more) {
                current.next = more;
                more.prev = current;
            }
        } else {
            return null;
        }

        if (null != a) sum += a.data;
        if (null != b) sum += b.data;

        // Didn't add the carry
        if (carry.data != 0) {
            sum += carry.data;
            carry.data = 0;
        }

        carry.data = sum / 10;
        current.data = sum % 10;
        return current;
    }

    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        while (node != null) {
            value = value * 10 + node.data;
            node = node.next;
        }
        return value;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(1, null, lB2);

        LinkedListNode list3 = addHelper(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }


}