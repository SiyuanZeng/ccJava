package Interview0_2;

/**
 * Created by SiyuanZeng's on 5/3/2016.
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int temp = Integer.MAX_VALUE;
            for(int j=i; j<arr.length; j++){
                if(temp > arr[j]){
                    temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
        return arr;
    }
}
