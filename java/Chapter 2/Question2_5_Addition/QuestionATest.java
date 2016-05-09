package Question2_5_Addition;

import CtCILibrary.LinkedListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/10/2016.
 */
public class QuestionATest {

    @org.junit.Test
    public void testLinkedListToIntNull() throws Exception {
        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = QuestionA.addLists(null, lB1, 0);

        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());


        int l2 = QuestionA.linkedListToInt(lB1);
        int l3 = QuestionA.linkedListToInt(list3);

    }

    @org.junit.Test
    public void testLinkedListToInt999And100() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = QuestionA.addLists(lA1, lB1, 0);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionA.linkedListToInt(lA1);
        int l2 = QuestionA.linkedListToInt(lB1);
        int l3 = QuestionA.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));

        lB1 = new LinkedListNode(1, null, null);
        lB2 = new LinkedListNode(0, null, lB1);
        lB3 = new LinkedListNode(0, null, lB2);
        LinkedListNode lB4 = new LinkedListNode(0, null, lB3);

        assertEquals(list3, lB4);

    }

    @org.junit.Test
    public void testLinkedListToInt99Add100() throws Exception {
        // 99 + 100
        LinkedListNode lA2 = new LinkedListNode(9, null, null);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = QuestionA.addLists(lA2, lB1, 0);

        System.out.println("  " + lA2.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionA.linkedListToInt(lA2);
        int l2 = QuestionA.linkedListToInt(lB1);
        int l3 = QuestionA.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));

        lB1 = new LinkedListNode(1, null, null);
        lB2 = new LinkedListNode(0, null, lB1);
        lB3 = new LinkedListNode(0, null, lB2);

        assertEquals(list3, lB3);

    }

    @org.junit.Test
    public void testLinkedListToInt999Add10() throws Exception {
        // 999 + 10
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(0, null, null);
        LinkedListNode lB2 = new LinkedListNode(1, null, lB1);

        LinkedListNode list3 = QuestionA.addLists(lA1, lB1, 0);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionA.linkedListToInt(lA1);
        int l2 = QuestionA.linkedListToInt(lB1);
        int l3 = QuestionA.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));


        lB1 = new LinkedListNode(1, null, null);
        lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);
        LinkedListNode lB4 = new LinkedListNode(9, null, lB3);

        assertEquals(list3, lB4);

    }
}