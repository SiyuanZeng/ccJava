package Question2_0_String_Manipulation.Question2_14_StringToInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class StringToIntegerTest {

    @Test
    public void testStringToIntViaIntegerParseInt1() throws Exception {
        assertEquals(123456, StringToInteger.stringToIntViaIntegerParseInt("123456"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToIntViaIntegerParseIntWithEmptyString2() throws Exception {
        StringToInteger.stringToIntViaIntegerParseInt("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testStringToIntViaIntegerParseIntWithNull3() throws Exception {
        StringToInteger.stringToIntViaIntegerParseInt(null);
    }

    @Test
    public void testStringToIntViaIntegerValueOf4() throws Exception {
        assertEquals(123456, StringToInteger.stringToIntViaIntegerValueOf("123456"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToIntViaIntegerValueOfWithEmptyString5() throws Exception {
        StringToInteger.stringToIntViaIntegerValueOf("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringToIntViaIntegerValueOfWithNull6() throws Exception {
        StringToInteger.stringToIntViaIntegerValueOf(null);
    }

    @Test
    public void testIntToStringViaIntegerToString7() throws Exception {
        assertEquals("123456", StringToInteger.intToStringViaIntegerToString(123456));
    }

    @Test
    public void testIntToStringViaStringValueOf10() throws Exception {
        assertEquals("123456", StringToInteger.intToStringViaStringValueOf(123456));
    }
}