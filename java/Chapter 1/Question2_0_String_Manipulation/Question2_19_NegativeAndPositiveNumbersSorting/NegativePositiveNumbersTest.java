package Question2_0_String_Manipulation.Question2_19_NegativeAndPositiveNumbersSorting;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 4/26/2016.
 */
public class NegativePositiveNumbersTest {

    @Test
    public void istPalindrom() throws Exception {
        int[] numbers = new int[] {-1, 5, -2, 3, 9, -10, -5, 3};
        System.out.println(Arrays.equals(new int[] {-1, -2, -10, -5, 5, 3, 9, 3},NegativePositiveNumbers.sort(numbers)));


    }
}