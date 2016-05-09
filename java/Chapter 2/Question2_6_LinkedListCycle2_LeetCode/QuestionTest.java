package Question2_6_LinkedListCycle2_LeetCode;

import CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class QuestionTest {

    @Test
    public void test() throws Exception {
        int list_length = 100;
        int k = 10;

        // Create linked list
        LinkedListNode[] nodes = new LinkedListNode[list_length];
        for (int i = 0; i < list_length; i++) {
            nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }

        // Create loop;
        nodes[list_length - 1].next = nodes[list_length - k];

        LinkedListNode loop = Question.FindBeginning(nodes[0]);
        assertEquals(loop.data, 90);
    }

    @Test
    public void testNoLoop() throws Exception {
        int list_length = 100;
        int k = 10;

        // Create linked list
        LinkedListNode[] nodes = new LinkedListNode[list_length];
        for (int i = 0; i < list_length; i++) {
            nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }
        // Create loop; nodes[list_length - 1].next = nodes[list_length - k];
        LinkedListNode loop = Question.FindBeginning(nodes[0]);

        assertEquals(loop, null);
    }
}