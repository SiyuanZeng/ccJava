package Question2_0_String_Manipulation.Question2_5_ReverseTheString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class ReverseTheStringTest {

    @Test
    public void testReverse1() throws Exception {
        assertEquals("avaJyM", ReverseTheString.stringBufferReverse("MyJava"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverseWithEmptyString2() throws Exception {
        assertEquals("", ReverseTheString.stringBufferReverse(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverse2WithNull3() throws Exception {
        assertEquals("", ReverseTheString.stringBufferReverse(null));
    }

    @Test
    public void reverse24() throws Exception {
        assertEquals("avaJyM", ReverseTheString.iterativeReverse("MyJava"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void reverse2WithEmptyString5() throws Exception {
        assertEquals("", ReverseTheString.iterativeReverse(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverse2WithNull6() throws Exception {
        assertEquals("", ReverseTheString.iterativeReverse(null));
    }

    @Test
    public void recursiveReverse7() throws Exception {
        assertEquals("avaJyM", ReverseTheString.recursiveReverse("MyJava"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void recursiveReverse8WithEmptyString() throws Exception {
        ReverseTheString.iterativeReverse("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void recursiveReverse9WithNull() throws Exception {
        ReverseTheString.iterativeReverse(null);
    }

    @Test
    public void swapRecursive10() throws Exception {
        assertEquals("avaJyM", ReverseTheString.swapRecursive("MyJava"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void swapRecursiveWithEmptyString11() throws Exception {
        ReverseTheString.iterativeReverse("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void swapRecursiveWithNull12() throws Exception {
        ReverseTheString.iterativeReverse(null);
    }
}