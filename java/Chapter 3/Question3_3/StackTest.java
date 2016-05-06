package Question3_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/14/2016.
 *
 * Test sub method first, granual methods first.
 */
public class StackTest {
    @Test
    public void testIsFullFalse1() throws Exception {
        Stack stack = new Stack(3);
        stack.push(0);
        assertEquals(false, stack.isFull());

    }
    @Test
    public void testIsFullTrue1() throws Exception {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(true, stack.isFull());
    }

    @Test
    public void testPop1() throws Exception {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(stack.pop(), 0);
    }
    @Test
    public void testPushFalse2() throws Exception {
        Stack stack = new Stack(0);
        assertEquals(false, stack.push(0));
    }

    @Test
    public void testPushTrue3() throws Exception {
        Stack stack = new Stack(1);
        assertEquals(true, stack.push(0));
    }



    @Test
    public void testIsEmpty4() throws Exception {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testJoin5() throws Exception {
        Node below = new Node(1);
        Node above = new Node(4);

        Stack stack = new Stack(2);

        stack.join(above, below);

        assertEquals(1, above.below.value);

        assertEquals(4, below.above.value);

    }
    @Test
    public void testPushWithJoin6() throws Exception {
        Stack stack = new Stack(5);
        stack.push(0);
        stack.push(1);
        assertEquals(1, stack.top.value);
        assertEquals(0, stack.top.below.value);

    }


    @Test
    public void testPushBottom7() throws Exception {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(0, stack.bottom.value);

    }


    @Test
    public void testRemoveBottomMultipleNodes8() throws Exception {
        Stack stack = new Stack(3);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        assertEquals(0, stack.removeBottom());
        assertEquals(1, stack.removeBottom());
        assertEquals(2, stack.bottom.value);
    }


    @Test
    public void removedNullBottom() throws Exception {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(0, stack.removeBottom());
        assertEquals(-1, stack.removeBottom());
    }
}