package Question2_5_Addition.Practice._140_Reverse_05;

import CtCILibrary.LinkedListNode;

/**
 * Created by SiyuanZeng's on 9/2/2014.
 */
public class Reverse {

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = add(lA1, lB1, 0);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = linkedListToInt(lA1);
        int l2 = linkedListToInt(lB1);
        int l3 = linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }

    public static int linkedListToInt2(LinkedListNode node) {
        int value = 0;
        if (node.next != null) {
            value = 10 * linkedListToInt(node.next);
        }
        return value + node.data;
    }

    public static int linkedListToInt(LinkedListNode node) {
        int value = 0;
        int base = 1;
        int current = 0;
        while (null != node) {
           current = node.data * base;
           value += current;
           node = node.next;
           base = 10 * base;
       }
       return value ;
    }


    public static LinkedListNode add ( LinkedListNode l1, LinkedListNode l2, int carry) {

        LinkedListNode current = new LinkedListNode(carry, null, null);


        if (null != l1) carry += l1.data;
        if (null != l2) carry += l2.data;


        current.data = carry % 10;



//Need to add carry, so this one can not return null.
        if ( null != l1 || null != l2 || carry > 10 ) {
            LinkedListNode more = add (
                                        null == l1? null: l1.next,
                                        null == l2? null: l2.next,
                                        carry >= 10? 1: 0
                                       ) ;
            current.setNext(more);
        }


        return current;

    }



}
