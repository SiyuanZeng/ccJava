package Question2_0_String_Manipulation.Question2_7_RemoveWhiteSpaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class RemoveWhiteSpacesTest {

    @Test
    public void testRemove1() throws Exception {
        assertEquals("Iamthebest!", RemoveWhiteSpaces.remove("I am the best!"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithEmptyString2() throws Exception {
        RemoveWhiteSpaces.remove("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithNull3() throws Exception {
        RemoveWhiteSpaces.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringBufferRemove3() throws Exception {
        RemoveWhiteSpaces.stringBufferRemove(null);
    }

    @Test
    public void testStringBufferRemove4() throws Exception {
        assertEquals("Iamthebest!", RemoveWhiteSpaces.stringBufferRemove("I am the best!"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringBufferRemoveWithEmptyString5() throws Exception {
        RemoveWhiteSpaces.stringBufferRemove("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringBufferRemoveWithNull6() throws Exception {
        RemoveWhiteSpaces.stringBufferRemove(null);
    }

    @Test
    public void removeDuplicateSpaces7() throws Exception {
        assertEquals("I am the best!", RemoveWhiteSpaces.removeDuplicateSpaces("I  am the best!"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void removeDuplicateSpacesWithEmptyString8() throws Exception {
        RemoveWhiteSpaces.stringBufferRemove("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeDuplicateSpacesWithNull9() throws Exception {
        RemoveWhiteSpaces.stringBufferRemove(null);
    }
}