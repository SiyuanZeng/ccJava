package Interview0_1;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 4/30/2016.
 */
public class PartionNegativeAndPositiveTest extends TestCase {
    @Test
    public void testSort() throws Exception {
        int[] arr1= new int[]{-1,-2,-3,-4,-5,-4,2,3,4,2,1,1,2,3,4};
        int[] arr2= new int[]{-1,-3,-3,-4,-5,-4,2,3,4,2,1,1,2,3,4};
        Arrays.equals(arr2, PartionNegativeAndPositive.sort(new int[]{-1,-2,-3,-4,-5,-4,2,3,4,2,1,1,2,3,4}));
    }
}