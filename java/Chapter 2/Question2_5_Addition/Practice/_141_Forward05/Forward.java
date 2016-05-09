package Question2_5_Addition.Practice._141_Forward05;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/3/2014.
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

    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        while (node != null) {
            value = value * 10 + node.data;
            node = node.next;
        }
        return value;
    }



    public static Result addHelper (LinkedListNode l1, LinkedListNode l2) {
        if ( null == l1 && null == l2) {
            return null;
        }

        Result res = new Result();
        LinkedListNode current = new LinkedListNode();

        int sum = 0;

        if (null != l1) sum += l1.data;
        if (null != l2) sum += l2.data;

        res.carry = sum / 10;
        current.data = sum % 10;
        res.result = current;


        Result more = addHelper (l1.next, l2.next) ;

        if ( null != more) {
            current = setPrev(current, more.result);
            res.result = current; // was more before
        }

        return res;
    }








    public static LinkedListNode add(LinkedListNode l1, LinkedListNode l2) {
        if (null == l1 || null == l2) {
            return null;
        }

        int len1 = size(l1);
        int len2 = size(l2);

        if (len1 > len2) {
            l2 = padList( l2, len1 - len2) ;
        } else {
            l1 = padList( l1, len2 - len1) ;
        }

        Result res = addHelper(l1, l2);

        LinkedListNode current= new LinkedListNode();
        if ( res.carry != 0) {
            current.data = res.carry;
            current = setPrev( current, res.result) ;
        }

        return current;
    }


   public static LinkedListNode setPrev( LinkedListNode current, LinkedListNode next) {
        if ( null != next && null != current) {
            current.next = next;
            next.prev = current;
        }

        return current;
    }






    public static LinkedListNode padList(LinkedListNode head, int size) {

        for ( int j = 0; j < size ; j++) {
            LinkedListNode node = new LinkedListNode();
            node.next = head;
            head.prev = node;
            head = node;
        }

        return head;


    }



    public static int size(LinkedListNode head) {
        if (null == head) return 0;
        return 1 + size(head.next);
    }

}
