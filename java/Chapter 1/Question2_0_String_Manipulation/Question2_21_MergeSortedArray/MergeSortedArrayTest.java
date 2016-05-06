package Question2_0_String_Manipulation.Question2_21_MergeSortedArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SiyuanZeng's on 4/27/2016.
 */
public class MergeSortedArrayTest {
    @Test
    public void easyNumber() throws Exception {
        int[] arr1 = new int[] {0, 1, 2, 3, 4};
        int[] arr2 = new int[] {5, 6, 7, 8, 9};

        assert(Arrays.equals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, MergeSortedArray.mergerSort(arr1, arr2)));
    }

    @Test
    public void mixedNumber() throws Exception {
        int[] arr1 = new int[] {0, 1, 3, 23, 4};
        int[] arr2 = new int[] {5, 46, 97, 28, 9};

        assert(Arrays.equals(new int[] {0, 1, 3, 4, 5, 9, 23, 28, 46, 97}, MergeSortedArray.mergerSort(arr1, arr2)));
    }

    @Test
    public void mergeSortBetter() throws Exception {
        int[] arr1 = new int[] {0, 1, 3, 23, 4};
        int[] arr2 = new int[] {5, 46, 97, 28, 9};

        assert(Arrays.equals(new int[] {0, 1, 3, 4, 5, 9, 23, 28, 46, 97}, MergeSortedArray.mergerSortBetter(arr1, arr2)));
    }


}
