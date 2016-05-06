package Question3_2.Original;


import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/14/2016.
 */
public class StackWithMin2Test{
    @Test
    public void push() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(1);
        assertEquals(stack.pop().intValue(), 1);
    }

    @Test
    public void twoPush() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(1);
        stack.push(10);
        assertEquals(stack.pop().intValue(), 10);
    }

    @Test(expected = EmptyStackException.class)
    public void zeroPushPop() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.pop().intValue();
    }

    @Test
    public void oneMin() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(1);
        assertEquals(stack.min(), 1);
    }

    @Test
    public void twoMin() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(10);
        stack.push(1);
        assertEquals(stack.min(), 1);
    }


    @Test
    public void duplicateMin() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(10);
        stack.push(1);
        stack.push(1);
        assertEquals(stack.min(), 1);
        assertEquals(stack.pop().intValue(), 1);
        assertEquals(stack.min(), 1);
        assertEquals(stack.pop().intValue(), 1);
        assertEquals(stack.min(), 10);
        assertEquals(stack.pop().intValue(), 10);
    }

    @Test
    public void biggerThanMin() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        stack.push(10);
        stack.push(3);
        stack.push(4);
        assertEquals(stack.min(), 3);
        assertEquals(stack.pop().intValue(), 4);
        assertEquals(stack.min(), 3);
        assertEquals(stack.pop().intValue(), 3);
        assertEquals(stack.min(), 10);
        assertEquals(stack.pop().intValue(), 10);
    }


    @Test
    public void emptyMin() throws Exception {
        StackWithMin2 stack = new StackWithMin2();
        assertEquals(stack.min(), Integer.MAX_VALUE);

    }


}