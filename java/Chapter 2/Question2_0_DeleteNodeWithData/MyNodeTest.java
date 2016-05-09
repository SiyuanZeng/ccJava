package Question2_0_DeleteNodeWithData;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class MyNodeTest {

    @Test
    public void testAppendToTail1() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);

        assertEquals(10, myNode.getData());

    }

    @Test
    public void appendToTailInsertToTheEnd2() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);

        assertEquals("10->10->8->4",myNode.printForward());

    }

    @Test
    public void testDeleteNode3() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);

        assertEquals("10->10->8",myNode.deleteNode(4, myNode).printForward());
        assertEquals("10->10->8",myNode.printForward());
    }


    @Test
    public void deleteNodeWithMiddleNode4() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);

        assertEquals("10->10->4",myNode.deleteNode(8, myNode).printForward());
    }


    @Test
    public void deleteNodeWithNodeNotInTheLinkedList5() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);

        assertEquals("10->10->8->4",myNode.deleteNode(1, myNode).printForward());
    }

    @Test
    public void deleteAllNode6() throws Exception {
        MyNode first = new MyNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode head = first;
        for (int i = 1; i < 8; i++) {
            MyNode second = new MyNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        MyNode.deleteNode(1, head);
        assertEquals("0->0->0->0", MyNode.deleteAllNode(1, head).printForward());
    }

    @Test
    public void deleteAllMiddleNode7() throws Exception {
        MyNode first = new MyNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode head = first;
        for (int i = 1; i < 8; i++) {
            MyNode second = new MyNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        head.appendToTail(10);
        head.appendToTail(8);
        head.appendToTail(4);

        MyNode.deleteNode(1, head);
        assertEquals("0->0->0->0->10->8->4", MyNode.deleteAllNode(1, head).printForward());
    }

    @Test
    public void deleteAllNonexistentNode8() throws Exception {
        MyNode first = new MyNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode head = first;
        for (int i = 1; i < 8; i++) {
            MyNode second = new MyNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        MyNode.deleteNode(1, head);
        assertEquals("0->0->1->0->1->0->1", MyNode.deleteAllNode(2, head).printForward());
    }

    @Test
    public void clone9() throws Exception {
        MyNode myNode = new MyNode(10);
        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);
        assertEquals("10->10->8->4", myNode.clone().printForward());

    }

    @Test
    public void cloneWithOneNode10() throws Exception {
        MyNode myNode = new MyNode(10);
        assertEquals("10", myNode.clone().printForward());

    }
}

























