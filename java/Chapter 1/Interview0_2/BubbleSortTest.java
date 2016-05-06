package Interview0_2;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort() throws Exception {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] arrResult = BubbleSort.bubbleSort(arr);
        for (int i = 0; i < arrResult.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrResult[i]);
        }
        assert(Arrays.equals(new int[]{0,1,2,3,4,5,6,7,8,9}, arrResult));

    }
}