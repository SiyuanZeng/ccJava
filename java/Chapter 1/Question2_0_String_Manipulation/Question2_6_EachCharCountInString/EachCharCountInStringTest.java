package Question2_0_String_Manipulation.Question2_6_EachCharCountInString;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class EachCharCountInStringTest {

    @Test
    public void testCharacterCount1() throws Exception {
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<Character, Integer>();
        map.put('L', 1);
        map.put('o', 1);
        map.put('v', 1);
        map.put('e', 1);
        assertEquals(map, EachCharCountInString.characterCountWithoutSort("Love"));
    }


    @Test
    public void testCharacterCountSorted2() throws Exception {
        TreeMap<Character, Integer> map = new  TreeMap<Character, Integer>();
        map.put(' ', 1);
        map.put('2', 1);
        map.put('E', 2);
        map.put('J', 1);
        map.put('a', 2);
        map.put('j', 1);
        map.put('v', 1);
        assertEquals(map, EachCharCountInString.characterCountSorted("Java j2EE"));
    }


    @Test
    public void testCharacterCountSortedAndIgnoreCases3() throws Exception {
        TreeMap<Character, Integer> map = new  TreeMap<Character, Integer>();
        map.put(' ', 1);
        map.put('2', 1);
        map.put('E', 2);
        map.put('J', 2);
        map.put('a', 2);
        map.put('v', 1);
        assertEquals(map, EachCharCountInString.characterCountSortedAndIgnoreCases("Java j2EE"));
    }
}