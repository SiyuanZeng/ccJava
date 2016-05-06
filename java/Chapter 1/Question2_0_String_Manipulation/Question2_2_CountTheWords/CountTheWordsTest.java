package Question2_0_String_Manipulation.Question2_2_CountTheWords;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/21/2016.
 */
public class CountTheWordsTest {

    @Test
    public void postiveCase() throws Exception {
        assertEquals(13,CountTheWords.countTheWords("Short for organic meaning better than fresh. Also means extremely cool or dope."));
    }


    @Test
    public void multipleSpace() throws Exception {
        assertEquals(4,CountTheWords.countTheWords("Short   for"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMain() throws Exception {
        CountTheWords.countTheWords("");
    }
}