package RealInterview;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SiyuanZeng's on 5/4/2016.
 */
public class Expedia0504Test {


    @Test(expected = IllegalArgumentException.class)
    public void testNull() throws Exception {
        assertEquals(new Character('f'), Expedia0504.findMostFrequentChar(null));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyString() throws Exception {
        assertEquals(new Character('f'), Expedia0504.findMostFrequentChar(""));

    }

    @Test
    public void onlyOneDuplicate() throws Exception {
        assertEquals(new Character('c'), Expedia0504.findMostFrequentChar("abcc"));

    }
    @Test
    public void testMultipleDuplicate() throws Exception {
        assertEquals(new Character('f'), Expedia0504.findMostFrequentChar("cbbaabasdfaqwreffgfffffffffffff"));

    }
}


/*

    Test cases:
    1) null
    2) empty string
    3) -- test --> t
    4) -- abba --> a

*/