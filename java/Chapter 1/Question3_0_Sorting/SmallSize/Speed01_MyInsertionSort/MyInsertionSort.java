package Question3_0_Sorting.SmallSize.Speed01_MyInsertionSort;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class MyInsertionSort {
    public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}