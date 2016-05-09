package Question2_1_DuplicateWordsInString;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/25/2016.
 */
public class QuestionTest {

    @Test
    public void testTap() throws Exception {

    }

    @Test
    public void testDeleteDupsA1() throws Exception {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        LinkedListNode clone = head.clone();

        assertEquals("0->1->0->1->0->1->0->1", head.printForward());
        assertEquals("0->1", Question.deleteDupsA(head).printForward());
    }


    @Test
    public void deleteDupsAWithOneDuplicateData2() throws Exception {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;

        for (int i = 1; i < 3; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        LinkedListNode duplicate = new LinkedListNode(2, null, null);
        first.setNext(duplicate);

        assertEquals("0->1->2->2", head.printForward());
        assertEquals("0->1->2", Question.deleteDupsA(head).printForward());
    }

    @Test
    public void testDeleteDupsCWithNullLinkedList3() throws Exception {
        LinkedListNode first = null; //AssortedMethods.randomLinkedList(1000, 0, 2);
        assertEquals(null, Question.deleteDupsC(first));
    }

    @Test
    public void testDeleteDupsCWithOneDuplicate4() throws Exception {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;

        for (int i = 1; i < 3; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        LinkedListNode duplicate = new LinkedListNode(2, null, null);
        first.setNext(duplicate);

        assertEquals("0->1->2->2", head.printForward());
        assertEquals("0->1->2", Question.deleteDupsA(head).printForward());
    }

    @Test
    public void testDeleteDupsBWithNullLinkedList5() throws Exception {
        LinkedListNode first = null; //AssortedMethods.randomLinkedList(1000, 0, 2);
        assertEquals(null, Question.deleteDupsB(first));
    }

    @Test
    public void testDeleteDupsBWithOneDuplicate6() throws Exception {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;

        for (int i = 1; i < 3; i++) {
            second = new LinkedListNode(i, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        LinkedListNode duplicate = new LinkedListNode(2, null, null);
        first.setNext(duplicate);

        assertEquals("0->1->2->2", head.printForward());
        assertEquals("0->1->2", Question.deleteDupsB(head).printForward());
    }
}