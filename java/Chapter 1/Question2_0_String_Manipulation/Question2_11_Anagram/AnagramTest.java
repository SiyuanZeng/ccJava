package Question2_0_String_Manipulation.Question2_11_Anagram;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class AnagramTest {

    @Test
    public void testIsAnagram1() throws Exception {
        assertEquals(true, Anagram.isAnagram("keEp", "peeK"));
    }


    @Test
    public void isAnagramNegative2() throws Exception {
        assertEquals(true, Anagram.isAnagram("Mother In Law", "Hitler Woman"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isAnagramWithEmptyString3() throws Exception {
        assertEquals(true, Anagram.isAnagram("", "Hitler Woman"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void isAnagramNull4() throws Exception {
        assertEquals(true, Anagram.isAnagram(null, "Hitler Woman"));
    }


    @Test
    public void testIsAnagramWithMultipleStrings5() throws Exception {
        ArrayList<String> expected= new ArrayList<String>();
        expected.add("Debit Card");
        expected.add("Debit Cards");
        expected.add("Dirty Roo");
        expected.add("Dirty Room");
        expected.add("ASTRONOMERS");
        expected.add("ASTRONOMER");
        expected.add("Toss");
        expected.add("Shot");

        ArrayList<String> listOfAnagram = new ArrayList<String>();
        listOfAnagram.add("MotherInLaw");
        listOfAnagram.add("LawInMother");
        listOfAnagram.add("keEp");
        listOfAnagram.add("peeK");
        listOfAnagram.add("SiLeNtCAT");
        listOfAnagram.add("AcTSiLeNt");
        listOfAnagram.add("Debit Card");
        listOfAnagram.add("Debit Cards");
        listOfAnagram.add("School MASTER");
        listOfAnagram.add("MASTERSchool");
        listOfAnagram.add("Dirty Roo");
        listOfAnagram.add("Dirty Room");
        listOfAnagram.add("ASTRONOMERS");
        listOfAnagram.add("ASTRONOMER");
        listOfAnagram.add("Toss");
        listOfAnagram.add("Shot");
        listOfAnagram.add("nejoy");
        listOfAnagram.add("enjoy");

        assertEquals(expected, Anagram.isAnagramWithMultipleStrings(listOfAnagram));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramWithEmptyArrayList6() throws Exception {
        ArrayList<String> expected= new ArrayList<String>();
        expected.add("Debit Card");
        expected.add("Debit Cards");
        expected.add("Dirty Roo");
        expected.add("Dirty Room");
        expected.add("ASTRONOMERS");
        expected.add("ASTRONOMER");
        expected.add("Toss");
        expected.add("Shot");

        ArrayList<String> listOfAnagram = new ArrayList<String>();

        Anagram.isAnagramWithMultipleStrings(listOfAnagram);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramWithEmptyArrayList7() throws Exception {
        Anagram.isAnagramWithMultipleStrings(null);
    }
}