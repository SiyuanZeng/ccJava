package Interview0_3;

import Question1_1.Question;
import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/18/2016.
 */
public class UniqueCharacterTest {

    @Test
    public void testIsUniqueChars() throws Exception {

    }

    @Test
    public void testIsUniqueChars2() throws Exception {

    }

    @Test
    public void testMain() throws Exception {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + Question.isUniqueChars(word) + " " + Question.isUniqueChars2(word));
        }
    }
}