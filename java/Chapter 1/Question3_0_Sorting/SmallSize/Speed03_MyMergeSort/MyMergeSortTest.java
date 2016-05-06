package Question3_0_Sorting.SmallSize.Speed03_MyMergeSort;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class MyMergeSortTest {

    @Test
    public void testSort() throws Exception {
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}