package Question3_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class SetOfStacksTest {
    @Test(expected = NullPointerException.class)
    public void getLastStack1() throws Exception {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        assertEquals(set.getLastStack(), null);
    }

    @Test
    public void stacksSize2() throws Exception {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        set.push(1);
        assertEquals(set.stacks.size(), 1);
    }

    @Test
    public void getLastStack3() throws Exception {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        set.push(1);
        Stack stack = set.getLastStack();
        assertEquals(stack.pop(), 1);
    }


    @Test
    public void stacksSizeZero4() throws Exception {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        Stack stack = set.getLastStack();
        assertEquals(stack.pop(), 1);
    }


    @Test
    public void popAt5() throws Exception {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        Stack stack = set.getLastStack();
        assertEquals(stack.pop(), 1);
    }
}