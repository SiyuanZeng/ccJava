package Question2_2_nthToLast;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/25/2016.
 */
public class QuestionTest {

    @Test
    public void testNthToLastR1_1() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        int nth = 3;
        assertEquals(10, Question.size(head));
        assertEquals(10, Question.nthToLastPrintOut(head, nth));
    }

    @Test
    public void testNthToLastR1_LessThanExpected_2() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        int nth = 13;
        assertEquals(10, Question.nthToLastPrintOut(head, nth));
    }

    @Test
    public void nthToLastR2_3() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 3;
        assertEquals(3, Question.size(Question.nthToLastWrapper(head, nth)));
    }

    @Test
    public void NthToLastR3Helper_4() throws Exception {

        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 3;
        assertEquals(3, Question.size(Question.nthToLastResult(head, nth)));
    }

    @Test
    public void testNthToLastR3_6_TheNIsTooBig() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 23;
        assertEquals(null, Question.nthToLastResult(head, nth));
    }

    @Test
    public void testNthToLastR3_7_Positive() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 3;
        assertEquals(3, Question.size(Question.nthToLastResult(head, nth)));
    }


    @Test
    public void testNthToLastR3_8_NullNode() throws Exception {
        int nth = 3;
        assertEquals(0, Question.size(Question.nthToLastResult(null, nth)));
    }

    @Test
    public void NthToLast_9() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 3;
        assertEquals(3, Question.size(Question.nthToLast(head, nth)));
    }


    @Test
    public void NthToLast_9_GetTheLastNode() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 10;
        assertEquals(10, Question.size(Question.nthToLast(head, nth)));
    }


    @Test
    public void NthToLast_10_Get11thNode() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        int nth = 11;
        assertEquals(0, Question.size(Question.nthToLast(head, nth)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nthToLastR2_5_ChangeTheMethodWithAnotherLevelAcceptingOnly2ParametersAndNullHeadNode() throws Exception {
        LinkedListNode head = null;
        int nth = 3;
        assertEquals(3, Question.size(Question.nthToLastWrapper(head, nth)));
    }


    @Test(expected = IllegalArgumentException.class)
    public void nthToLastR2_5_ChangeTheMethodWithAnotherLevelAcceptingOnly2ParametersAndNegativePositionNumber() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        int nth = -3;
        assertEquals(3, Question.size(Question.nthToLastWrapper(head, nth)));
    }
}