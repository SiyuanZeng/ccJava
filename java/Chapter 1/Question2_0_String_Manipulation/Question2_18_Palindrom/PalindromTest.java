package Question2_0_String_Manipulation.Question2_18_Palindrom;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 4/26/2016.
 */
public class PalindromTest {

    @Test
    public void istPalindrom() throws Exception {
        char c[] = {'A', 'A', 'A', 'A', 'A'};
        assert (Palindrom.istPalindrom(c));
    }
}