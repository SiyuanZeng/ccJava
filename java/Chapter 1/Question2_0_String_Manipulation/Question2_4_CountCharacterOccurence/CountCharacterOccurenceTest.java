package Question2_0_String_Manipulation.Question2_4_CountCharacterOccurence;

import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class CountCharacterOccurenceTest {

    @Test
    public void count() throws Exception {
        String s = "Java is java again java again";

        char c = 'a';

        assertEquals(10, CountCharacterOccurence.count(s, c));
    }


    @Test
    public void countZeroCharacter() throws Exception {
        String s = "is ";

        char c = 'a';

        assertEquals(0, CountCharacterOccurence.count(s, c));
    }



    @Test
    public void countAllCharacters() throws Exception {
        String s = "Java is java";
        TreeMap<Character, Integer> map = new  TreeMap<Character, Integer>();
        map.put(' ', 2);
        map.put('a', 4);
        map.put('i', 1);
        map.put('j', 2);
        map.put('s', 1);
        map.put('v', 2);
        System.out.print(CountCharacterOccurence.countAll(s));
        assertEquals(map, CountCharacterOccurence.countAll(s));
    }


    @Test(expected = IllegalArgumentException.class)
    public void countAllCharactersWithEmptyString() throws Exception {
        String s = "";
        TreeMap<Character, Integer> map = new  TreeMap<Character, Integer>();
        assertEquals(map, CountCharacterOccurence.countAll(s));
    }
}
