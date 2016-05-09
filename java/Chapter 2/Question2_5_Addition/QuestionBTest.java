package Question2_5_Addition;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/10/2016.
 */
public class QuestionBTest {

    @Test
    public void testLinkedListToInt() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = QuestionB.addLists(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionB.linkedListToInt(lA1);
        int l2 = QuestionB.linkedListToInt(lB1);
        int l3 = QuestionB.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));

        lB1 = new LinkedListNode(4, null, null);
        lB2 = new LinkedListNode(1, null, lB1);
        lB3 = new LinkedListNode(5, null, lB2);

        assertEquals(list3, lB1);
    }

    @Test
    public void testLinkedListToInt999And111() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(0, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(1, null, lB2);

        LinkedListNode list3 = QuestionB.addLists(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionB.linkedListToInt(lA1);
        int l2 = QuestionB.linkedListToInt(lB1);
        int l3 = QuestionB.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));

        lB1 = new LinkedListNode(1, null, null);
        lB2 = new LinkedListNode(0, null, lB1);
        lB3 = new LinkedListNode(0, null, lB2);
        LinkedListNode lB4 = new LinkedListNode(0, null, lB3);

        assertEquals(list3, lB4);
    }

    @Test
    public void testLinkedListToInt1And199() throws Exception {
        LinkedListNode lA3 = new LinkedListNode(1, null, null);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(9, null, lB2);

        LinkedListNode list3 = QuestionB.addLists(lA3, lB1);

        System.out.println("  " + lA3.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = QuestionB.linkedListToInt(lA3);
        int l2 = QuestionB.linkedListToInt(lB1);
        int l3 = QuestionB.linkedListToInt(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));

        lB1 = new LinkedListNode(2, null, null);
        lB2 = new LinkedListNode(0, null, lB1);
        lB3 = new LinkedListNode(0, null, lB2);

        assertEquals(list3, lB1);
    }
}