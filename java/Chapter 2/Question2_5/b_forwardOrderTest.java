package Question2_5;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/10/2016.
 */
public class b_forwardOrderTest {


    @Test
    public void testPositive() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        PartialSum list3 = b_forwardOrder.addListHelper(lA1, lB1);

        lB1 = new LinkedListNode(4, null, null);
        lB2 = new LinkedListNode(1, null, lB1);
        lB3 = new LinkedListNode(5, null, lB2);

        assertEquals(list3.sum, lB1);
    }

    @Test
    public void testOneNull() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        PartialSum list3 = b_forwardOrder.addListHelper(lA1, null);

        LinkedListNode lB1 = new LinkedListNode(3, null, null);
        LinkedListNode lB2 = new LinkedListNode(1, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(5, null, lB2);

        System.out.println("Sum:"+list3.sum.printForward());
        System.out.println("Expect:"+lB1.printForward());
        assertEquals(list3.sum, lB1);
    }

    @Test
    public void testSecondNull() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        PartialSum list3 = b_forwardOrder.addListHelper(null, lA1);

        LinkedListNode lB1 = new LinkedListNode(3, null, null);
        LinkedListNode lB2 = new LinkedListNode(1, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(5, null, lB2);

        System.out.println("Sum:"+list3.sum.printForward());
        System.out.println("Expect:"+lB1.printForward());
        assertEquals(list3.sum, lB1);
    }


}