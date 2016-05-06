package Interview0_3.Array.Speed02_MyQuickSort;

import org.junit.Test;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class QuickSortTest {

    @Test
    public void testSort() throws Exception {
        QuickSort sorter = new QuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}