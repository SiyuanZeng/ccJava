package Question2_5_Addition.Practice.Forward_160;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/7/2014.
 */
public class Forward {

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(1, null, lB2);

        LinkedListNode list3 = add(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }

    public static int linkedListToInt(LinkedListNode l1){
        if (null == l1) return 0;
        int value = 0;
        while (null != l1){
                value = value *10 + l1.data;
                l1 = l1.next;
        }

        return value;

    }

    public static PartialSum forward(LinkedListNode l1, LinkedListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        }

        LinkedListNode current = new LinkedListNode();
        PartialSum res= forward(l1.next, l2.next);
        int sum = l1.data + l2.data;
        if (null != res) sum += res.carry;
        current.data = sum % 10;// mode
        if (null != res) {
            current.next = res.node;
            res.node.prev = current;
        } else {
            res = new PartialSum();
        }
        res.node = current;
        res.carry = sum/10;

        return res;
    }



    public static LinkedListNode setPrevious (LinkedListNode current, int res) {
        LinkedListNode node = new LinkedListNode(res, null, null);
        if (null != current) current.next = node;
        node.prev = current;
        return current;
    }

    public static int len(LinkedListNode head) {
        if (null == head) return 0;
        return 1+ len(head.next);
    }

    public static LinkedListNode padList(LinkedListNode head, int len) {	// What the sequence should be?
        LinkedListNode current = head;
        while (null != current.next) {
            current = current.next;
        }

        for (int j = 0; j < len; j++) {
            LinkedListNode node = new LinkedListNode();
            current.next = node;
        }

        return head;
    }


    public static LinkedListNode add(LinkedListNode l1, LinkedListNode l2) {
        if ( null == l1 && null == l2) {
            return null;
        }

        LinkedListNode current = new LinkedListNode();

        int len1 = len(l1);
        int len2 = len(l2);

        if ( len1 > len2) { l2 = padList(l2, len1 - len2);}
        if ( len1 < len2) { l1 = padList(l1, len2 - len1);}

        PartialSum res = forward(l1, l2);

        current = res.node;

        if (0 != res.carry) {
            current = setPrevious(current, res.carry);
        }

        return current;
    }
}
