package Question2_0_String_Manipulation.Question2_12_ReverseStringWithSpacesPosition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/22/2016.
 */
public class ReverseStringWithSpacesPositionTest {

    @Test
    public void testReverseString1() throws Exception {
        assertEquals("g ni rtS toNmAI", ReverseStringWithSpacesPosition.reverseString("I Am Not String"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyString2() throws Exception {
        ReverseStringWithSpacesPosition.reverseString("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void null3() throws Exception {
        ReverseStringWithSpacesPosition.reverseString(null);
    }


    @Test
    public void nonSpace4() throws Exception {
        assertEquals("555554444333221", ReverseStringWithSpacesPosition.reverseString("122333444455555"));
    }


    @Test
    public void testReverseStringWithConsecutiveSpaces5() throws Exception {
        assertEquals("D  C  A", ReverseStringWithSpacesPosition.reverseString("A  C  D"));
    }



    @Test
    public void testReverseStringWithFrontMultipleSpaces5() throws Exception {
        assertEquals("    D  C", ReverseStringWithSpacesPosition.reverseString("    C  D"));
    }

    @Test
    public void testReverseStringWithEndMultipleSpaces5() throws Exception {
        assertEquals("C    A      ", ReverseStringWithSpacesPosition.reverseString("A    C      "));
    }
}