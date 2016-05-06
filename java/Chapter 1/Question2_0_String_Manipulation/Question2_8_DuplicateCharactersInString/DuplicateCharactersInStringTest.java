package Question2_0_String_Manipulation.Question2_8_DuplicateCharactersInString;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class DuplicateCharactersInStringTest {

    @Test
    public void testDuplicateCharCount1() throws Exception {
        Set<Character> duplicateChars= new LinkedHashSet<Character>();
        duplicateChars.add('Z');
        duplicateChars.add('B');
        duplicateChars.add('J');
        duplicateChars.add('a');
        duplicateChars.add('E');
        assertEquals(duplicateChars, DuplicateCharactersInString.duplicateChars("ZZBBJavaJ2EE"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateCharCountWithEmptyString2() throws Exception {
        DuplicateCharactersInString.duplicateChars("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateCharCountWithNull3() throws Exception {
        DuplicateCharactersInString.duplicateChars(null);
    }

    @Test
    public void testDuplicateCharsWithCount4() throws Exception {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
        charCountMap.put('Z', 2);
        charCountMap.put('B', 2);
        charCountMap.put('J', 2);
        charCountMap.put('a', 2);
        charCountMap.put('v', 1);
        charCountMap.put('2', 1);
        charCountMap.put('E', 2);
        assertEquals(charCountMap, DuplicateCharactersInString.duplicateCharsWithCount("ZZBBJavaJ2EE"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateCharsWithCountWithEmptyString5() throws Exception {
        DuplicateCharactersInString.duplicateChars("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateCharsWithCountWithNull6() throws Exception {
        DuplicateCharactersInString.duplicateChars(null);
    }
}