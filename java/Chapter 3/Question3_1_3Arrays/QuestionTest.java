package Question3_1_3Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/11/2016.
 */
public class QuestionTest {
    @Test
    public void testNoLoop() throws Exception {
        Question.push(2, 4);
        System.out.println("Peek 2: " + Question.peek(2));
        assertEquals(Question.peek(2), 4);
        Question.push(0, 3);
        Question.push(0, 7);
        Question.push(0, 5);
        System.out.println("Peek 0: " + Question.peek(0));
        assertEquals(Question.peek(0), 5);
        assertEquals(Question.pop(0), 5);
        System.out.println("Peek 0: " + Question.peek(0));
        assertEquals(Question.peek(0), 7);
        assertEquals(Question.pop(0), 7);
        System.out.println("Peek 0: " + Question.peek(0));
        assertEquals(Question.peek(0), 3);
    }
}