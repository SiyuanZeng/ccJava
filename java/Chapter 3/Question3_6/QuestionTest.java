package Question3_6;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/17/2016.
 */
public class QuestionTest {

    @Test
    public void testMergesort() throws Exception {

    }

    @Test
    public void testSort1() throws Exception {

            Stack<Integer> s = new Stack<Integer>();

            s.push(1);
            s.push(3);
            s.push(2);
            s.push(6);
            s.push(4);
            s = Question.sort(s);

            assertEquals("[1, 2, 3, 4, 6]", s.toString());

            System.out.println("Stack: " + s);

    }




    @Test
    public void shouldReturnNullWhenTheStackIsNull2() throws Exception {
        Stack<Integer> s = new Stack<Integer>();
        s = Question.sort(s);

        assertEquals("[]", s.toString());
        System.out.println("Stack: " + s);

    }

    @Test
    public void shouldReturnSortedValueWhenTheArrayIsSortedAlready() throws Exception {
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);

        s = Question.sort(s);

        assertEquals("[1, 2]", s.toString());

        System.out.println("Stack: " + s);

    }

    @Test
    public void shouldReturnSortedValueWhenTheStackIsReverseSorted() throws Exception {
        Stack<Integer> s = new Stack<Integer>();

        s.push(2);
        s.push(1);

        s = Question.sort(s);

        assertEquals("[1, 2]", s.toString());

        System.out.println("Stack: " + s);

    }
    @Test
    public void testMain() throws Exception {

    }
}
