package Question2_1_DuplicateWordsInString;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class MyNodeTest {

    @Test
    public void testAppendToTail() throws Exception {

    }

    @Test
    public void testDeleteNode() throws Exception {

    }

    @Test
    public void testDeleteNode1() throws Exception {

    }

    @Test
    public void testDeleteAllNode() throws Exception {

    }

    @Test
    public void testClone() throws Exception {

    }

    /*
    *    public static void main(String[] args) {
        MyNode first = new MyNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode NodeToDelete = new MyNode(1, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode head = first;
        for (int i = 1; i < 8; i++) {
            MyNode second = new MyNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        MyNode clone = head.clone();
        deleteCurrentNode(1, head);
        System.out.println(head.printForward());

        deleteAllNode(1, head);
        System.out.println(head.printForward());

        first = new MyNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        NodeToDelete = new MyNode(1, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        head = first;
        first.setNext(NodeToDelete );
        NodeToDelete.setPrevious(first);
        System.out.println(head.printForward());
        clone = head.clone();
        deleteCurrentNode(1, head);
        System.out.println(head.printForward());

        MyNode<String> firstString = new MyNode("Book1", null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        MyNode<String>  nodeToDeleteString = new MyNode("Book2", null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        head = firstString;
        firstString.setNext(nodeToDeleteString);
        nodeToDeleteString.setPrevious(firstString);
        System.out.println(head.printForward());
        clone = head.clone();
        deleteCurrentNode("Book2", head);
        System.out.println(head.printForward());
    }
    *
    *
    * */
}