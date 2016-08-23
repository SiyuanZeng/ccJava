package Array;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/24/2016.
 */
public class MergeKArrayTest {

    @Test
    public void testMerger() throws Exception {
        int[][] A = {
                {2,3,5,6,7},
                {1,3,5,34,1235},
                {0,9,6,31,0}
        };

        MergeKArray.merger(A, 3, 4);

    }
}