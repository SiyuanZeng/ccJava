package Question2_1_DuplicateWordsInString;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/19/2016.
 */
public class duplicateWordsInStringTest {


    @Test
    public void shouldReturnNullWhenThereAreNotDuplicate() throws Exception {
        Map<String, Integer> map = duplicateWordsInString.duplicateWords("My name is Siyuan Zeng,");
        assertEquals(0, map.size());
    }

    @Test
    public void testDuplicateWords() throws Exception {
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("bread", 2);
        treeMap.put("and", 2);

        assertEquals(treeMap, duplicateWordsInString.duplicateWords("bread Bread and And"));
    }
}