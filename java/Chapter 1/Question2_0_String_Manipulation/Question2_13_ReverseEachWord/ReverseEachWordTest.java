package Question2_0_String_Manipulation.Question2_13_ReverseEachWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/22/2016.
 */
public class ReverseEachWordTest {

    @Test
    public void reverseEachWordOfString() throws Exception {
        assertEquals("555554444333221", ReverseEachWord.reverseEachWordOfString("122333444455555"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverseEachWordOfStringEmptyString() throws Exception {
        ReverseEachWord.reverseEachWordOfString("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverseEachWordOfStringNull() throws Exception {
        ReverseEachWord.reverseEachWordOfString(null);
    }


    @Test
    public void recursiveReverse() throws Exception {
        assertEquals("987654321", ReverseEachWord.recursiveReverse("123456789"));
    }



    @Test(expected = IllegalArgumentException.class)
    public void recursiveReverseEmptyString3() throws Exception {
        ReverseEachWord.recursiveReverse(null);
    }


    @Test(expected = IllegalArgumentException.class)
    public void recursiveReverseEmptyString4() throws Exception {
        ReverseEachWord.recursiveReverse(null);
    }
}