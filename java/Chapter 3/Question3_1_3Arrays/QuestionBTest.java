package Question3_1_3Arrays;

import CtCILibrary.AssortedMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class QuestionBTest {
    @Test
    public void testNoLoop() throws Exception {
        QuestionB.push(0, 10);
        QuestionB.push(1, 20);
        QuestionB.push(2, 30);

        QuestionB.push(1, 21);
        QuestionB.push(0, 11);
        QuestionB.push(0, 12);

        QuestionB.pop(0);

        QuestionB.push(2, 31);

        QuestionB.push(0, 13);
        QuestionB.push(1, 22);

        QuestionB.push(2, 31);
        QuestionB.push(2, 32);
        QuestionB.push(2, 33);
        QuestionB.push(2, 34);

        System.out.println("Final Stack: " + AssortedMethods.arrayToString(QuestionB.buffer));

        QuestionB.pop(1);
        QuestionB.push(2, 35);

        System.out.println("Final Stack: " + AssortedMethods.arrayToString(QuestionB.buffer));
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);

        QuestionB.push(2, 31);

    }

    @Test
    public void testExpand() throws Exception {
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);

        QuestionB.push(0, 10);
    }

    @Test
    public void testShift() throws Exception {
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);
        QuestionB.push(0, 10);

        QuestionB.push(1, 10);
        QuestionB.push(1, 10);
        QuestionB.push(1, 10);
        QuestionB.push(1, 10);

        QuestionB.push(0, 10);
    }

    @Test(expected = Exception.class)
    public void testPopEmptyStack() throws Exception {
        QuestionB.pop(0);
    }

    @Test
    public void testPop() throws Exception {
        QuestionB.push(0, 10);
        assertEquals(QuestionB.pop(0), 10);
    }

    @Test
    public void testPeek() throws Exception {
        QuestionB.push(0, 10);
        assertEquals(QuestionB.peek(0), 10);
    }

    @Test
    public void testIsEmpty() throws Exception {
        QuestionB.push(0, 10);
        assertEquals(QuestionB.isEmpty(0), false);

    }
}