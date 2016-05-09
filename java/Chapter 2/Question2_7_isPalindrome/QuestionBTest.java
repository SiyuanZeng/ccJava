package Question2_7_isPalindrome;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class QuestionBTest {

    @Test
    public void testNoLoop() throws Exception {

        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];

        // data
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        // convert array to linkedList
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        //nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        assertTrue(QuestionB.isPalindrome(head));
    }

    @Test
    public void testShortLoop() throws Exception {

        int length = 3;
        LinkedListNode[] nodes = new LinkedListNode[length];

        // data
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        //nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        assertTrue(QuestionB.isPalindrome(head));
    }


    @Test
    public void test() throws Exception {

        int length = 3;
        LinkedListNode[] nodes = new LinkedListNode[length];

        // data
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        //nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        assertTrue(QuestionB.isPalindrome(head));
    }
}