package Question2_5_Addition.Practice.Reverse_159;

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

    public static LinkedListNode add(LinkedListNode l1, LinkedListNode l2, int carry) {
        if (null == l1 && null == l2 && 0 == carry) {
            return null;
        }
        LinkedListNode current = new LinkedListNode();

        int sum = 0;
        if (null != l1) sum += l1.data;
        if (null != l2) sum += l2.data;
        sum += carry;

        current.data = sum % 10;

        if (null != l1 || null != l2 ||  sum >=10 ) {
            LinkedListNode more  = add(
                    null == l1 ? null : l1.next,
                    null == l2 ? null : l2.next,
                    sum >= 10 ? sum / 10 : 0
            ) ;

                if (null != more) {
                    current.setNext(more);
                }
        }

        return current;
    }


    public static int linkedListToInt(LinkedListNode l1) {
        int value = 0;
        if (null != l1.next) {
            value = linkedListToInt(l1.next);
        }
        return value*10 + l1.data;
    }




}
