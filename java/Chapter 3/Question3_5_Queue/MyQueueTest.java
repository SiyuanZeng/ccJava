package Question3_5_Queue;

import CtCILibrary.AssortedMethods;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/16/2016.
 */
public class MyQueueTest {

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(0);

        assertEquals(0, test_queue.peek().intValue());
    }

    @Test
    public void testAddTwoValues2() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(0);
        test_queue.add(1);
        assertEquals(0, test_queue.peek().intValue());
        assertEquals(0, test_queue.remove().intValue());
        assertEquals(1, test_queue.peek().intValue());
    }

    @Test
         public void testShiftStack3() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(1);
        assertEquals(1, test_queue.stackNewest.peek().intValue());
        assertEquals(true, test_queue.stackOldest.empty());
        test_queue.shiftStacks();
        assertEquals(true, test_queue.stackNewest.empty());
        assertEquals(1, test_queue.stackOldest.peek().intValue());


        test_queue.add(2);
        test_queue.shiftStacks();
        assertEquals(2, test_queue.stackNewest.peek().intValue());
        assertEquals(false, test_queue.stackOldest.empty());
        assertEquals(false, test_queue.stackOldest.empty());


        assertEquals(1, test_queue.peek().intValue());
    }

    @Test
    public void testShiftStackWithNode4() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(1);
        test_queue.shiftStacks();
        test_queue.add(2);
        test_queue.shiftStacks();
        assertEquals(2, test_queue.stackNewest.peek().intValue());
        assertEquals(false, test_queue.stackOldest.empty());
        assertEquals(false, test_queue.stackOldest.empty());

        assertEquals(1, test_queue.peek().intValue());
    }

    @Test
    public void testPeek5() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(1);
        assertEquals(1, test_queue.peek().intValue());
        test_queue.add(2);
        assertEquals(1, test_queue.peek().intValue());
    }

    @Test
    public void testRemove6() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(1);
        assertEquals(1, test_queue.remove().intValue());
        test_queue.add(2);
        assertEquals(1, test_queue.peek().intValue());
    }


    @Test
    public void testAdd2NodeAndRemoveOne7() throws Exception {
        MyQueue<Integer> test_queue = new MyQueue<Integer>();
        test_queue.add(1);
        test_queue.add(2);
        assertEquals(1, test_queue.remove().intValue());
    }

    @Test
    public void main() throws Exception {
        MyQueue<Integer> my_queue = new MyQueue<Integer>();

        // Let's test our code against a "real" queue
        Queue<Integer> test_queue = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            int choice = AssortedMethods.randomIntInRange(0, 10);
            if (choice <= 5) { // enqueue
                int element = AssortedMethods.randomIntInRange(1, 10);
                test_queue.add(element);
                my_queue.add(element);
                System.out.println("Enqueued " + element);
            } else if (test_queue.size() > 0) {
                int top1 = test_queue.remove();
                int top2 = my_queue.remove();
                if (top1 != top2) { // Check for error
                    System.out.println("******* FAILURE - DIFFERENT TOPS: " + top1 + ", " + top2);
                }
                System.out.println("Dequeued " + top1);
            }

            if (test_queue.size() == my_queue.size()) {
                if (test_queue.size() > 0 && test_queue.peek() != my_queue.peek()) {
                    System.out.println("******* FAILURE - DIFFERENT TOPS: " + test_queue.peek() + ", " + my_queue.peek() + " ******");
                }
            } else {
                System.out.println("******* FAILURE - DIFFERENT SIZES ******");
            }
        }
    }
}