package Question3_0_Sorting.SmallSize.Speed04_MySelectionSort;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/4/2016.
 */
public class MySelectionSortTest {

    @Test
    public void testDoSelectionSort() throws Exception {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = MySelectionSort.doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}