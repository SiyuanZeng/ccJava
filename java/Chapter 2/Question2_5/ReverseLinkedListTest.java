package Question2_5;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/10/2016.
 */
public class ReverseLinkedListTest {


    @Test
    public void testLinkedListToInt() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(5, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(1, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(3, null, lB2);


        LinkedListNode res = ReverseLinkedList.reverseLinkedList(lA1);

        System.out.println("res"+res.printForward());

        System.out.println("expect"+lB1.printForward());

        assertEquals(res, lB1);
    }


    @Test
    public void test1Node() throws Exception {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);

        LinkedListNode lB1 = new LinkedListNode(3, null, null);


        LinkedListNode res = ReverseLinkedList.reverseLinkedList(lA1);

        System.out.println("res"+res.printForward());

        System.out.println("expect"+lB1.printForward());

        assertEquals(res, lB1);
    }


    @Test
    public void testnull() throws Exception {
        LinkedListNode lA1 = null;

        LinkedListNode res = ReverseLinkedList.reverseLinkedList(lA1);


        assert(res == null);
    }

}