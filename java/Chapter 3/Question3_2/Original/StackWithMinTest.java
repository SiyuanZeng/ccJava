package Question3_2.Original;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class StackWithMinTest {
    @Test
    public void push() throws Exception {
        StackWithMin stack = new StackWithMin();
        stack.push(1);
        assertEquals(stack.pop().value, 1);
    }

    @Test
    public void twoPush() throws Exception {
        StackWithMin stack = new StackWithMin();
        stack.push(1);
        stack.push(10);
        assertEquals(stack.pop().value, 10);
    }

    @Test
    public void oneMin() throws Exception {
        StackWithMin stack = new StackWithMin();
        stack.push(1);
        assertEquals(stack.min(), 1);
    }

    @Test
    public void twoMin() throws Exception {
        StackWithMin stack = new StackWithMin();
        stack.push(10);
        stack.push(1);
        assertEquals(stack.min(), 1);
    }
}