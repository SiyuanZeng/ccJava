package Question2_3;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/25/2016.
 */
public class QuestionTest {

    @Test
    public void deleteCurrentNode_1() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        assert(Question.deleteCurrentNode(head.next.next.next.next)); // delete node 5
        System.out.println(head.printForward());
    }

    @Test
    public void deleteCurrentNode_WithNullNode_2() throws Exception {
        LinkedListNode head = null;
        assert(!Question.deleteCurrentNode(head)); // delete node 5
    }


    @Test
    public void deleteNodeByNum2WhenTheNodeIsNull() throws Exception {
        // 4th
        assert (!Question.deleteNodeByNum(null, 4)); // delete node 4
    }

    @Test
    public void deleteNodeByNum2WhenOneNode() throws Exception {
        // 4th
        LinkedListNode head = new LinkedListNode(1, null, null);
        assert (!Question.deleteNodeByNum(head, 4)); // delete node 4
    }

    @Test
    public void deleteNodeByNum2WhenTheNodeIsOutOfBound() throws Exception {
        // 4th
        LinkedListNode head = new LinkedListNode(1, null, null);
        LinkedListNode second = new LinkedListNode(1, null, null);
        head.setNext(second);
        assert (!Question.deleteNodeByNum(head, 4)); // delete node 4
    }


    @Test
    public void deleteNodeByNum() throws Exception {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        Question.deleteCurrentNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());


        // 4th
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 4)); // delete node 4
        System.out.println("deleteNodeByNum"+head.printForward());


        //1st
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum 1st Node"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 1)); // delete node 4
        System.out.println("deleteNodeByNum 1st Node"+head.printForward());

        //last
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum last Node"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 10)); // delete node 4
        System.out.println("deleteNodeByNum last Node"+head.printForward());
    }

    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        Question.deleteCurrentNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());

        // 4th
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 4)); // delete node 4
        System.out.println("deleteNodeByNum"+head.printForward());

        //1st
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum 1st Node"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 1)); // delete node 4
        System.out.println("deleteNodeByNum 1st Node"+head.printForward());

        //last
        head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println("deleteNodeByNum last Node"+head.printForward());
        System.out.println(Question.deleteNodeByNum(head, 10)); // delete node 4
        System.out.println("deleteNodeByNum last Node"+head.printForward());
    }
}