package Question3_0_Sorting.SmallSize.Speed01_MyInsertionSort;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class MyInsertionSortTest {

    @Test
    public void testDoInsertionSort() throws Exception {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = MyInsertionSort.doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}