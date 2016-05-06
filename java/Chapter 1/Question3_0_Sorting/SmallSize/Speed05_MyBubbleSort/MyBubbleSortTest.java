package Question3_0_Sorting.SmallSize.Speed05_MyBubbleSort;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/4/2016.
 */
public class MyBubbleSortTest {

    @Test
    public void testBubble_srt() throws Exception {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        MyBubbleSort.bubble_srt(input);
    }
}